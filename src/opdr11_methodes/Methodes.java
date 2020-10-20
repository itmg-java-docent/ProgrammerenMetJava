package opdr11_methodes;

import java.util.Locale;
import java.util.Scanner;

public class Methodes {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Voer een bedrag in:");
        var beginBedrag = s.nextFloat();
        System.out.println("Voer een maandrente in:");
        var maandRente = s.nextFloat();
        System.out.println("Uw eindbedrag bedraagt na 10 jaar:");
        maandRente /= 100;
        beginBedrag = berekenEindBedrag(beginBedrag, maandRente);
        System.out.println(beginBedrag);
        System.out.printf(Locale.GERMAN, "Geformateerd eindbedrag:%n%,.2f", beginBedrag);
    }

    static float berekenEindBedrag(float beginBedrag, float maandRente) {
        for (var i = 1; i < 12 * 10; i++) {
            beginBedrag += beginBedrag * maandRente;
        }
        return beginBedrag;
    }
}