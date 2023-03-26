package AbstractFactory.BankingProjectFactory;
import AbstractFactory.*;

public class BankingTeamFactory implements TeamFactory {

	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester createTester() {
		return new QATester();
	}

	@Override
	public ProductManager createManager() {
		return new BankingProductManager();
	}
	
}
