package Builder;

public class SecondWebsiteBuilder extends WebsiteBuilder {

	@Override
	void buildName() {
		website.setName("Second Website");
		
	}

	@Override
	void buildCMS() {
		website.setCms(Cms.LIFRESCO);
		
	}

	@Override
	void buildPrice() {
		website.setPrice(500);

	}
	
	
}
