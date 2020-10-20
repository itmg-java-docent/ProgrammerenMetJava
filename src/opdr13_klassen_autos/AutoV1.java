package opdr13_klassen_autos;

public class AutoV1 {
    int snelheid = 0;
    String merk = "Toyota";
    int kilometerstand = 23000;

    public void start() {
        System.out.println("de "+merk+" start");
    }

    public void stop() {
        System.out.println("de "+merk+" stopt");
    }

    public void geefGas() {
        System.out.println("de "+merk+" rijdt");
    }

    public int getKilometerStand() {
        return kilometerstand;
    }

    public static void main(String[] args) {
        var auto1 = new AutoV1();
        auto1.start();
        auto1.geefGas();
        auto1.stop();
        System.out.printf("De kilometerstand van de %s is: %d kilometer ", auto1.merk, auto1.getKilometerStand());
    }
}