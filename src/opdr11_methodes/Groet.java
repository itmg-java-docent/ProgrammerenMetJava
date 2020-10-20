package opdr11_methodes;

public class Groet {
    public static void main(String[] args) {
        helloWorld();
        groet();
        System.out.println(groet("Jan"));
    }

    static void helloWorld() {
        System.out.println("Hello, World!");
    }

    static void groet() {
        System.out.println("Hallo, User!");
    }
//  deze methode is uitgeschakeld omdat hij de overloading regels overtreedt
//    static void groet(String naam) {
//        System.out.println("Hallo "+ naam+"!");
//    }
    static String groet(String naam) {
        return "Hallo "+naam+"!";
    }
}
