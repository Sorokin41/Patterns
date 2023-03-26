package Builder;

public class Director {
	WebsiteBuilder websiteBuilder;

	public void setWebsiteBuilder(WebsiteBuilder websitebuilder) {
		this.websiteBuilder = websitebuilder;
	}
	
	public Website buildWebsite() {
		websiteBuilder.createWebsite();
		
		websiteBuilder.buildName();
		websiteBuilder.buildCMS();
		websiteBuilder.buildPrice();
		
		Website website = websiteBuilder.getWebsite();
		
		return website;
	}
}
