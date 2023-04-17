package Generating.FactoryMethod;

public class JavaDeveloperFuctory implements DeveloperFuctory {
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

}
