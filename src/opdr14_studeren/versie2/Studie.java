package opdr14_studeren.versie2;

public class Studie {
    String naam = "Culturele Antropologie";
    Student[] studenten = new Student[10];
    String[] vakken = {"onderzoeksmethoden", "religie", "burgerschap", "globalisatie"};

    public void vakken() {
        for (var v : vakken) {
            System.out.println(v);
        }
    }

    public Student zoekStudent(int studentnr) {
        for (var s : studenten) {
            if (s.studentNummer == studentnr)
                return s;
        }
        return null;
    }
}
