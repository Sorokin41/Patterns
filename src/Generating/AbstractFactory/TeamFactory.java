package Generating.AbstractFactory;

public interface TeamFactory {
	public Developer createDeveloper();
	public Tester createTester();
	public ProductManager createManager();
}
