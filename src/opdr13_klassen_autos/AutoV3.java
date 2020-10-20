package opdr13_klassen_autos;

public class AutoV3 {
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
        snelheid+=20;
        kilometerstand+=20;
        System.out.printf("de %s rijdt met %d kilometer/uur%n", this.merk, this.snelheid);

    }

    public int getKilometerStand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public static void main(String[] args) {
        var auto3 = new AutoV3();
        auto3.setKilometerstand(10000);
        auto3.setMerk("Volvo");
        auto3.start();
        auto3.geefGas();
        auto3.geefGas();
        auto3.geefGas();
        auto3.stop();
        System.out.printf("De kilometerstand van de %s is: %d kilometer ", auto3.merk, auto3.getKilometerStand());
    }
}