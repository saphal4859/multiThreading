package in.jt;



public class Address {
	private String cityName;
	private String stateName;

	public Address() {
		System.out.println("\t Address-ZERO :: Constructor");
	}

	public Address(String cityName, String stateName) {
		System.out.println("\t Address-ARG :: Constructor");
		this.cityName=cityName;
		this.stateName=stateName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	


}
