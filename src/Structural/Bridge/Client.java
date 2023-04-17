package Structural.Bridge;


public class Client {
    public static void main(String[] args) {
        Program[] programs = {
                new BankingProgram(new CppDeveloper()),
                new WebsiteProgram(new CppDeveloper())};

        for(Program program : programs){
            program.developeProgram();
        }
    }
}
