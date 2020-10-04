package opdr84_paswoord;

import java.util.Scanner;

public class Paswoord {

    public static void main(String[] args) {
        var naam1 = "Alex";
        var naam2 = "Peter";

        var ww1 = "hello";
        var ww2 = "world";


        var ingelogd = false;

        do {
            var s = new Scanner(System.in);
            System.out.println("Voer gebruikersnaam in:");
            var gebruikersnaam = s.nextLine();
            System.out.println("Voer wachtwoord in:");
            var wachtwoord = s.nextLine();


            if (gebruikersnaam.equals(naam1) && wachtwoord.equals(ww1)) {
                ingelogd = true;
            } else if (gebruikersnaam.equals(naam2) && wachtwoord.equals(ww2)) {
                ingelogd = true;
            } else {
                System.out.println("verkeerde gebruikersnaam");
            }
        } while (ingelogd == false);

        System.out.println("Gefeliciteerd, je bent ingelogd!");


    }


}
