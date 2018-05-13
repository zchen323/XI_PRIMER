package xi.lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PrimerTest {
	
	public static void main(String[] args) throws Exception{
		
		if(args.length != 2){
			usage();
			System.exit(1);
		}
		String inputFilename = args[0];
		String outputDirectory = args[1];
		
		List<TestData> testData = readTestDataFromFile(inputFilename);
		BLASTPrimerRequest request = new BLASTPrimerRequest();
		
		List<Result> results = new ArrayList<Result>();
		
		
		for(TestData data : testData){
			try{
				System.out.println("==== starting process " + data.getName() + " ............");
				List<String> response = request.makeRequest(data.getPrimerLeftInput(), data.getPrimerRightInput());
				String jobId = processOutput(outputDirectory, data.getName(), response);
				results.add(new Result(data.getName(), "" + System.currentTimeMillis(), jobId));
				System.out.println("==== finished process " + data.getName());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		File isf = new File(inputFilename);
		
		
		buildSummaryHtml(outputDirectory + File.separator + isf.getName() + "_Summary.html", results);
		
		
	}
	
	private static String processOutput(String directory, String testname, List<String> result) throws IOException{
		File outputDir = new File(directory);// + File.separator + testname + ".html");
		if(!outputDir.exists()){
			outputDir.mkdirs();
		}
		File outputFile = new File(outputDir, testname + ".html");
		OutputStream os = new FileOutputStream(outputFile);
		String jobId = "";
		for(String line : result){
			os.write((line + "\n").getBytes());
			if(line.trim().startsWith("Job id=")){
				String temp = line.trim();
				int p0 = temp.indexOf("=");
				jobId = temp.substring(p0 + 1);
				System.out.println("===== jodID: " + jobId);
			}
		}
		os.flush();
		os.close();
		
		return jobId;
	}
	
	private static List<TestData> readTestDataFromFile(String filename) throws IOException{
		
		List<TestData> data = new ArrayList<TestData>();
		
		File file = new File(filename);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		while((line = br.readLine()) != null){
			line = line.trim();
			String[] inputs = line.split("\\s++");
			if(inputs.length == 3){
				TestData testData= new TestData();
				testData.setName(inputs[0]);
				testData.setPrimerLeftInput(inputs[1]);
				testData.setPrimerRightInput(inputs[2]);
				data.add(testData);
			}
		}
		
		return data;
	}
	
	
	private static void usage(){
		StringBuffer sb = new StringBuffer();
		sb.append("====== BLAST Primer batch request ======\n");
		sb.append("java -jar blast-primer-batch-request.jar testFile.txt resultDirectory");
		
		System.out.println(sb.toString());
	}
	
	//private static baseurl = "https://www.ncbi.nlm.nih.gov/tools/primer-blast/primertool.cgi?ctg_time=";//1526158863&job_key=cnitJCWHKC8PFT4QM3AaIklrCxBkeBANZQ

	private static void buildSummaryHtml(String filename, List<Result> results) throws IOException{
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head></head><body>");
		for(Result result : results){
			if(result.getJobId() != null && !result.getJobId().isEmpty()){
				sb.append("<p>").append(result.getName())
				.append("<a href=https://www.ncbi.nlm.nih.gov/tools/primer-blast/primertool.cgi?ctg_time=" 
				+ result.getTimestamp() + "&job_key=" 
				+ result.getJobId() + ">" + result.getName() + "</a>");
				sb.append("</p>");
			}else{
				sb.append("<p> please check " + result.getName() + ".html file").append("</p>");
			}
		}

		sb.append("</body></html>");
		
		OutputStream os = new FileOutputStream(new File(filename));
		os.write(sb.toString().getBytes());
		os.flush();
		os.close();
	}
	
	private void test(){
  String t = "" +      
 "       : results:\n" +
 "     Job id=pK57DabFq22MU65WozaKZNktm1b0PoBL9Q\n";
  
  

	}
	
}
