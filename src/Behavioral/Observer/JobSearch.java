package Behavioral.Observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();
        Observer observer = new Subscriber("Vladislav");
        Observer observer1 = new Subscriber("Angelina");

        javaDeveloperJobSite.addVacancy("Programmer");
        javaDeveloperJobSite.addVacancy("Tester");

        javaDeveloperJobSite.addObserver(observer);
        javaDeveloperJobSite.addObserver(observer1);

        javaDeveloperJobSite.addVacancy("QA Engineer");
    }
}
