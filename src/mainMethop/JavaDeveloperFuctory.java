package mainMethop;

public class JavaDeveloperFuctory implements DeveloperFuctory {
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

}
