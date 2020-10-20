package opdr13b_vervolg_autos.v2;

public class Auto {
    private int snelheid;
    private String merk;
    private int kilometerstand;

    public Auto(String merk) {
        this.merk = merk;
    }

    public static String motorgegevens() {
        return "Motor: Colombo V12 580 pk 980 kilo 3,8 liter";
    }

    public static void main(String[] args) {
        Auto auto = new Auto("Volvo");
        System.out.println(auto.snelheid);
        System.out.println(auto.merk);
        System.out.println(auto.kilometerstand);
        System.out.println(auto.motorgegevens());
        Auto tesla = new Auto("Tesla");
        System.out.println(tesla.snelheid);
        System.out.println(tesla.merk);
        System.out.println(tesla.kilometerstand);
        System.out.println(auto.motorgegevens());

    }
}
