package opdr82_spaaroverzicht;

import java.util.Locale;
import java.util.Scanner;

public class Sparen {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Wat is je naam?");
        var naam = s.nextLine();
        System.out.println("Hoelang wil je sparen (max 10 jaar)?");
        var aantalJaar = s.nextInt();
        while (aantalJaar < 1 || aantalJaar > 10) {
            System.out.println("Dit is niet mogelijk (max 10 jaar)");
            System.out.println("Hoelang wil je sparen?");
            aantalJaar = s.nextInt();
        }
        System.out.println("Hoeveel wil je sparen (max 10.000)?");
        float bedrag = s.nextInt();
        while (bedrag < 1 || bedrag > 10_000) {
            System.out.println("Dit is niet mogelijk (max 10.000)");
            System.out.println("Hoelang wil je sparen?");
            bedrag = s.nextInt();
        }
        System.out.printf(Locale.GERMANY, "Beste %s, dit is je spaaroverzicht met een beginbedrag van %,.2f en een rente van 5%%%n", naam, bedrag);
        for (var i=1; i <= aantalJaar; i++)
            System.out.printf("Jaar %d: %,.2f%n", i, (bedrag*=1.05));
    }
}


