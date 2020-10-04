package opdr83_vierkant;

public class Vierkant {
    public static void main(String[] args) {
        for (var i = 0; i <= 9; i++) {
            for (var j = 0; j < 10; j++) {
                var g = j + i * 10;
                System.out.print((g < 10 ? "0" + g : g) + " ");
            }
            System.out.println();
        }
    }
}