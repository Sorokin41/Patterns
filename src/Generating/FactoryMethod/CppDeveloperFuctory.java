package Generating.FactoryMethod;

public class CppDeveloperFuctory implements DeveloperFuctory {
	
	public Developer createDeveloper() {
		return new CppDeveloper();
	}

}
