package opdr14_studeren.versie1;

public class Universiteit {
    public static void main(String[] args) {
        Studie st = new Studie();
        Student s1 = new Student();
        s1.naam="Alex Zhao";
        s1.studentNummer = 89789;
        Student s2 = new Student();
        s2.naam = "Peter Roest";
        s2.studentNummer = 72642;
        st.studenten[0]=s1;
        st.studenten[1]=s2;

        for (var s : st.studenten) {
            System.out.println(s.naam+" "+s.studentNummer);
        }
    }
}
