package Generating.AbstractFactory.WebsiteProject;
import Generating.AbstractFactory.*;
import Generating.AbstractFactory.WebsiteProjectFactory.*;

public class Project {
	public static void main(String[] args) {
	TeamFactory team = new WebsiteTeamFactory();
	Developer developer = team.createDeveloper();
	Tester tester = team.createTester();
	ProductManager pm = team.createManager();
	
	System.out.println("Banking project created...");
	developer.writeCode();
	tester.testProject();
	pm.manageProject();
	}
}

