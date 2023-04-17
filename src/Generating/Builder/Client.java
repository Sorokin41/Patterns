package Generating.Builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		director.setWebsiteBuilder(new SecondWebsiteBuilder());
		Website website = director.buildWebsite();
		
		System.out.print(website.toString());
		
	}
}
