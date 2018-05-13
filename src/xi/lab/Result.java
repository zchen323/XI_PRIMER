package xi.lab;

public class Result {
	private String name;
	private String timestamp;
	private String jobId;
	
	public Result(){};
	public Result(String name, String timestamp, String jobId){
		this.name = name;
		this.timestamp = timestamp;
		this.jobId = jobId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
}
