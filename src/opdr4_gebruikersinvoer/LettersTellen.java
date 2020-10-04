package opdr4_gebruikersinvoer;

import java.util.Scanner;

public class LettersTellen {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Voer een woord in:");
        var woord = s.nextLine();
        var aantalLetters = woord.length();
        System.out.println("Het woord "+woord+" bevat "+ aantalLetters + " letters");
    }
}