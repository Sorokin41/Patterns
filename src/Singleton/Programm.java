package Singleton;

public class Programm {
	public static void main(String[] args) {
		ProgrammLogger.getProgrammLogger().addLogInfo("First log info");
		ProgrammLogger.getProgrammLogger().addLogInfo("Second log info");
		ProgrammLogger.getProgrammLogger().addLogInfo("Third log info");
		
		ProgrammLogger.getProgrammLogger().showLogInfo();
		
		
	}
}

