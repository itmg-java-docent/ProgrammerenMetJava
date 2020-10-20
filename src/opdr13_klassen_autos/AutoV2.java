package opdr13_klassen_autos;

public class AutoV2 {
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

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public static void main(String[] args) {
        var auto2 = new AutoV2();
        auto2.setKilometerstand(50000);
        auto2.start();
        auto2.geefGas();
        auto2.stop();
        System.out.printf("De kilometerstand van de %s is: %d kilometer ", auto2.merk, auto2.getKilometerStand());
    }
}