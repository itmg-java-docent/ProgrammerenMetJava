package opdr9_roulette;

import java.util.Random;

public class Roulette {
    public static void main(String[] args) {
        System.out.println("Amerikaanse Roulette");
        var bedrag = 100;
        var roulette = new Random();
        for (var i = 0; i < 10; i++) {
            var voorspelling = roulette.nextInt(36) + 1;
            var uitslag = roulette.nextInt(37);
            System.out.print("voorspelling: " + voorspelling);
            System.out.print(" uitslag: " + uitslag);
            var evenVoorspelling = voorspelling % 2 == 0;
            var evenUitslag = uitslag % 2 == 0;
            var onevenVoorspelling = voorspelling % 2 == 1;
            var onevenUitslag = uitslag % 2 == 1;
            if ((evenVoorspelling & evenUitslag) | (onevenVoorspelling & onevenUitslag)) {
                bedrag += 5;
                System.out.print(" winst! ");
            } else {
                bedrag -= 5;
                System.out.print(" verlies...");
            }
            System.out.println(" bedrag: " + bedrag);
        }
    }
}
