package AbstractFactory.WebsiteProjectFactory;

import AbstractFactory.*;

public class WebsiteTeamFactory implements TeamFactory {

	@Override
	public Developer createDeveloper() {
		return new CppDeveloper();
	}

	@Override
	public Tester createTester() {
		return new ManualTester();
	}

	@Override
	public ProductManager createManager() {
		return new WebsiteProductManager();
	}

}
