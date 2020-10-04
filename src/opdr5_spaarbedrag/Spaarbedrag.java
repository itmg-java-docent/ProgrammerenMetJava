package opdr5_spaarbedrag;

import java.util.Locale;
import java.util.Scanner;

public class Spaarbedrag {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Voer een bedrag in:");
        float bedrag = s.nextInt();
        System.out.println("Met een rente van 5,5% per jaar is het bedrag na 10 jaar:");
        System.out.printf(Locale.GERMAN, "Jaar 1: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 2: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 3: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 4: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 5: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 6: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 7: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 8: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 9: %,.2f%n" , bedrag *= 1.055);
        System.out.printf(Locale.GERMAN, "Jaar 10: %,.2f%n" , bedrag *= 1.055);

    }
}