package Builder;

public class FirstWebsiteBuilder extends WebsiteBuilder {

	@Override
	void buildName() {
		website.setName("First Website");
		
	}

	@Override
	void buildCMS() {
		website.setCms(Cms.WORDPRESS);
		
	}

	@Override
	void buildPrice() {
		website.setPrice(500);

	}
	
	
}
