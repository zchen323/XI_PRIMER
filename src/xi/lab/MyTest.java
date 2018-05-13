package xi.lab;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
	public static void main(String[] args) throws IOException{
		
		Map<String, String> httpHeader = new HashMap<String, String>();
		
		//Test2 test = new Test2("http://localhost:8081/primer-blast/primertool.cgi", httpHeader);
		BLASTPrimer test = new BLASTPrimer("https://www.ncbi.nlm.nih.gov/tools/primer-blast/primertool.cgi", httpHeader);
		
		String PRIMER_LEFT_INPUT = "CCACCGTGCAGCTCATCA";
		String PRIMER_RIGHT_INPUT = "GTTTCTGTTATAACCGAGGGTCATG";
		
				
		test.addFormField("INPUT_SEQUENCE", "");
		test.addFilePart("SEQFILE", "");
		test.addFormField("PRIMER5_START", "");
		test.addFormField("PRIMER5_END", "");
		test.addFormField("PRIMER3_START", "");
		test.addFormField("PRIMER3_END", "");
		test.addFormField("PRIMER_LEFT_INPUT", PRIMER_LEFT_INPUT);
		test.addFormField("PRIMER_RIGHT_INPUT", PRIMER_RIGHT_INPUT);
		test.addFormField("PRIMER_PRODUCT_MIN", "70");
		test.addFormField("PRIMER_PRODUCT_MAX", "1000");
		test.addFormField("PRIMER_NUM_RETURN", "10");
		test.addFormField("PRIMER_MIN_TM", "57.0");
		test.addFormField("PRIMER_OPT_TM", "60.0");
		test.addFormField("PRIMER_MAX_TM", "63.0");
		test.addFormField("PRIMER_MAX_DIFF_TM", "3");
		test.addFormField("PRIMER_ON_SPLICE_SITE", "0");
		test.addFormField("SPLICE_SITE_OVERLAP_5END", "7");
		test.addFormField("SPLICE_SITE_OVERLAP_3END", "4");
		test.addFormField("MIN_INTRON_SIZE", "1000");
		test.addFormField("MAX_INTRON_SIZE", "1000000");
		test.addFormField("SEARCH_SPECIFIC_PRIMER", "on");
		test.addFormField("SEARCHMODE", "0");
		test.addFormField("PRIMER_SPECIFICITY_DATABASE", "PRIMERDB/genome_selected_species");
		test.addFormField("CUSTOM_DB", "");
		test.addFilePart("CUSTOMSEQFILE", "");
		test.addFormField("ORGANISM", "Homo sapiens");
		test.addFormField("ORG_DBS", "on");
		
		test.addFormField("slctOrg", "");
		test.addFormField("ENTREZ_QUERY", "");
		test.addFormField("TOTAL_PRIMER_SPECIFICITY_MISMATCH", "1");
		test.addFormField("PRIMER_3END_SPECIFICITY_MISMATCH", "1");
		test.addFormField("MISMATCH_REGION_LENGTH", "5");
		test.addFormField("TOTAL_MISMATCH_IGNORE", "6");
		test.addFormField("MAX_TARGET_SIZE", "4000");
		test.addFormField("SHOW_SVIEWER", "on");
		test.addFormField("HITSIZE", "50000");
		test.addFormField("UNGAPPED_BLAST", "on");
		test.addFormField("EVALUE", "30000");
		test.addFormField("WORD_SIZE", "7");
		test.addFormField("MAX_CANDIDATE_PRIMER", "500");
		test.addFormField("NUM_TARGETS", "20");
		test.addFormField("NUM_TARGETS_WITH_PRIMERS", "1000");
		test.addFormField("MAX_TARGET_PER_TEMPLATE", "100");
		test.addFormField("PRODUCT_MIN_TM", "");
		test.addFormField("PRODUCT_OPT_TM", "");
		test.addFormField("PRODUCT_MAX_TM", "");
		test.addFormField("PRIMER_MIN_SIZE", "15");
		test.addFormField("PRIMER_OPT_SIZE", "20");
		test.addFormField("PRIMER_MAX_SIZE", "25");
		test.addFormField("PRIMER_MIN_GC", "20.0");
		test.addFormField("PRIMER_MAX_GC", "80.0");
		test.addFormField("GC_CLAMP", "0");
		test.addFormField("POLYX", "5");
		test.addFormField("PRIMER_MAX_END_STABILITY", "9");
		test.addFormField("PRIMER_MAX_END_GC", "5");
		test.addFormField("PRIMER_MAX_TEMPLATE_MISPRIMING_TH", "40.0");
		test.addFormField("PRIMER_PAIR_MAX_TEMPLATE_MISPRIMING_TH", "70.00");
		test.addFormField("PRIMER_MAX_SELF_ANY_TH", "45.0");
		test.addFormField("PRIMER_MAX_SELF_END_TH", "35.0");
		test.addFormField("PRIMER_PAIR_MAX_COMPL_ANY_TH", "45.0");
		test.addFormField("PRIMER_PAIR_MAX_COMPL_END_TH", "35.0");
		test.addFormField("PRIMER_MAX_HAIRPIN_TH", "24.0");
		test.addFormField("PRIMER_MAX_TEMPLATE_MISPRIMING", "12.00");
		test.addFormField("PRIMER_PAIR_MAX_TEMPLATE_MISPRIMING", "24.00");
		test.addFormField("SELF_ANY", "8.00");
		test.addFormField("SELF_END", "3.00");
		test.addFormField("PRIMER_PAIR_MAX_COMPL_ANY", "8.00");
		test.addFormField("PRIMER_PAIR_MAX_COMPL_END", "3.00");
		test.addFormField("EXCLUDED_REGIONS", "");
		test.addFormField("OVERLAP", "");
		test.addFormField("OVERLAP_5END", "7");
		test.addFormField("OVERLAP_3END", "4");
		test.addFormField("MONO_CATIONS", "50.0");
		test.addFormField("DIVA_CATIONS", "1.5");
		test.addFormField("CON_DNTPS", "0.6");
		test.addFormField("SALT_FORMULAR", "1");
		test.addFormField("TM_METHOD", "1");
		test.addFormField("CON_ANEAL_OLIGO", "50.0");
		test.addFormField("PRIMER_MISPRIMING_LIBRARY", "AUTO");
		test.addFormField("LOW_COMPLEXITY_FILTER", "on");
		test.addFormField("PRIMER_INTERNAL_OLIGO_MIN_SIZE", "18");
		test.addFormField("PRIMER_INTERNAL_OLIGO_OPT_SIZE", "20");
		test.addFormField("PRIMER_INTERNAL_OLIGO_MAX_SIZE", "27");
		test.addFormField("PRIMER_INTERNAL_OLIGO_MIN_TM", "57.0");
		test.addFormField("PRIMER_INTERNAL_OLIGO_OPT_TM", "60.0");
		test.addFormField("PRIMER_INTERNAL_OLIGO_MAX_TM", "63.0");
		test.addFormField("PRIMER_INTERNAL_OLIGO_MIN_GC", "20.0");
		test.addFormField("PRIMER_INTERNAL_OLIGO_OPT_GC_PERCENT", "50");
		test.addFormField("PRIMER_INTERNAL_OLIGO_MAX_GC", "80.0");
		test.addFormField("SHOW_SVIEWER", "on");
		test.addFormField("LINK_LOC", "");
		test.addFormField("SVIEWER_DATA_KEY", "");
		test.addFormField("CMD", "request");
		test.addFormField("NUM_DIFFS", "1");
		test.addFormField("NUM_OPTS_DIFFS", "0");
		
		

		List<String> result = test.finish();
		for(String s : result)
		System.out.println(s);
		
	}
}
