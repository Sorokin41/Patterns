package Generating.AbstractFactory.BankingProject;
import Generating.AbstractFactory.*;
import Generating.AbstractFactory.BankingProjectFactory.*;

public class Project {
	public static void main(String[] args) {
	TeamFactory team = new BankingTeamFactory();
	Developer developer = team.createDeveloper();
	Tester tester = team.createTester();
	ProductManager pm = team.createManager();
	
	System.out.println("Banking project created...");
	developer.writeCode();
	tester.testProject();
	pm.manageProject();
	}
}
