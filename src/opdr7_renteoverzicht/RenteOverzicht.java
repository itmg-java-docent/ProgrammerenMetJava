package opdr7_renteoverzicht;

import java.util.Locale;
import java.util.Scanner;

public class RenteOverzicht {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Wat is je naam?");
        var naam = s.nextLine();
        System.out.println("Welk bedrag wil je sparen?");
        double bedrag = s.nextInt();
        double fbedrag = bedrag;
        double rente = 0.0;
        if (bedrag >= 100 && bedrag <= 299) rente = 3;
        else if (bedrag >= 300 && bedrag <= 599) rente = 2;
        else if (bedrag >= 600 && bedrag <= 1000) rente = 1;
        else rente = 0;
        System.out.println("Beste " + naam + ", dit is je spaaroverzicht met een beginbedrag van " + bedrag + " en een rente van " + rente + "%:");
        System.out.println("Jaar 1: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 2: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 3: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 4: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 5: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 6: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 7: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 8: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 9: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Jaar 10: " + (bedrag *= 1 + (rente / 100)));
        System.out.println("Geformateerd:");

        System.out.printf(Locale.GERMAN, "Jaar 1: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 2: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 3: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 4: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 5: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 6: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 7: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 8: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 9: %,.2f%n", (fbedrag *= 1 + (rente / 100)));
        System.out.printf(Locale.GERMAN, "Jaar 10: %,.2f%n", (fbedrag *= 1 + (rente / 100)));

    }
}

