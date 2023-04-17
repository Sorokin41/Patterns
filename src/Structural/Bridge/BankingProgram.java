package Structural.Bridge;

public class BankingProgram extends Program {
    public BankingProgram(Developer developer){
        super(developer);
    }
    @Override
    public void developeProgram() {
        System.out.println("BankingProgram created. . .");
        developer.writeCode();
    }
}
