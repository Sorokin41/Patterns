package Singleton;

public class ProgrammLogger {
	private static ProgrammLogger programmLogger;
	private static String logInfo = "This is Programm log...\n\n";
	
	public static synchronized ProgrammLogger getProgrammLogger() {
		if (programmLogger == null)
			programmLogger = new ProgrammLogger();
		return programmLogger;
	}
	
	private ProgrammLogger() {}
	
	public void addLogInfo(String s) {
		logInfo += s + "\n";
	}
	
	public void showLogInfo() {
		System.out.print(logInfo);
	}

}
