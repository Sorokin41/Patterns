package Behavioral.TemplateMethod;

public class Client {
    public static void main(String[] args){
        NewsPage newsPage = new NewsPage();
        WelcomePage welcomePage = new WelcomePage();

        welcomePage.showPage();
        System.out.println("\n=============================================\n");
        newsPage.showPage();
    }
}
