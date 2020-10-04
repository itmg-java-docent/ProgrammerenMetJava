package opdr81_tafelloop;

import java.util.Scanner;

public class Tafel {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Voer een getal in:");
        var getal = s.nextInt();
        for (var i = 1; i <= 10; i++)
            System.out.println("1 x " + getal + " = " + getal * i);
    }
}