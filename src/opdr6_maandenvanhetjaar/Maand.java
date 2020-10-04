package opdr6_maandenvanhetjaar;

import java.util.Scanner;

public class Maand {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Kies een getal tussen 1 en 12:");
        var getal = s.nextInt();
        var maand = "";
        switch (getal) {
            case 1:
                maand = "januari";
                break;
            case 2:
                maand = "februari";
                break;
            case 3:
                maand = "maart";
                break;
            case 4:
                maand = "april";
                break;
            case 5:
                maand = "mei";
                break;
            case 6:
                maand = "juni";
                break;
            case 7:
                maand = "juli";
                break;
            case 8:
                maand = "augustus";
                break;
            case 9:
                maand = "september";
                break;
            case 10:
                maand = "oktober";
                break;
            case 11:
                maand = "november";
                break;
            case 12:
                maand = "december";
                break;
        }
        System.out.println(getal + " is de maand " + maand);
    }
}