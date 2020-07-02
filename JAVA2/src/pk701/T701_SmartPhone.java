package pk701;

public class T701_SmartPhone {
	private String company;
	private String os;
	T701_SmartPhone(String company, String os){
		this.company=company;
		this.os=os;
	}
	@Override
	public String toString() {
		return company+", "+os;
	}
	
}
