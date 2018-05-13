package xi.lab;

public class TestData {
	
	private String name;
	private String primerLeftInput;
	private String primerRightInput;
	
	public TestData(){}
	
	public TestData(String name, String primerLeftInput, String primerRightInput){
		this.name = name;
		this.primerLeftInput = primerLeftInput;
		this.primerRightInput = primerRightInput;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrimerLeftInput() {
		return primerLeftInput;
	}
	public void setPrimerLeftInput(String primerLeftInput) {
		this.primerLeftInput = primerLeftInput;
	}
	public String getPrimerRightInput() {
		return primerRightInput;
	}
	public void setPrimerRightInput(String primerRightInput) {
		this.primerRightInput = primerRightInput;
	}
	
}
