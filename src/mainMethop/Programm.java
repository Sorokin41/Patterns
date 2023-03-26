package mainMethop;

public class Programm {
	public static void main(String[] args) {
		DeveloperFuctory developerFuctory = createDeveloperFuctory("cpp");
		Developer developer = developerFuctory.createDeveloper();
		
		developer.writeCode();
	}
	
	static DeveloperFuctory createDeveloperFuctory(String special) {
		if (special.equalsIgnoreCase("java"))
				return new JavaDeveloperFuctory();
		else if (special.equalsIgnoreCase("Cpp"))
			return new CppDeveloperFuctory();
		else 
			throw new RuntimeException("can't be created");
	}
}
