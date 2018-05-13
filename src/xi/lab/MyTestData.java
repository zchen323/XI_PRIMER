package xi.lab;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="test")
public class MyTestData {
	
	List<TestData> testData = new ArrayList<TestData>();

	public List<TestData> getTestData() {
		return testData;
	}

	public void setTestData(List<TestData> testData) {
		this.testData = testData;
	}


	
}
