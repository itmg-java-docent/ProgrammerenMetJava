package opdr10_namenraden;

import java.util.Scanner;

public class NaamRaden {
    public static void main(String[] args) {
        System.out.println("Raad welke naam in de lijst voorkomt:");
        while (true) {
            var geraden = false;
            String[] namen = {"alex", "peter", "tom", "niels", "ho", "wing", "jason", "masha", "helen", "robert"};
            var s = new Scanner(System.in);
            var naam = s.nextLine();
            for (var i = 0; i < namen.length; i++) {
                if (namen[i].equalsIgnoreCase(naam)) {
                    System.out.println("Goed geraden! Deze naam staat op de " + i + "e plek in de lijst. Raad nog eens:");
                    geraden = true;
                }
            }
            if (!geraden) {
                System.out.println("Deze naam komt niet voor in de lijst. Raad nog eens:");
                geraden = false;
            }
        }
    }
}