package Generating.Builder;

public class Website {
	private String name = "";
	private Cms cms;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCms(Cms cms) {
		this.cms = cms;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "Website - (" + "name = " + name 
				+ ": CMS = " + cms 
				+ ": price = " 
				+ price + ")";
	}

}
