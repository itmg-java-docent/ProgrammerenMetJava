package opdr13b_vervolg_autos.v1;

public class Auto {
    private int snelheid;
    private String merk;
    private int kilometerstand;

    public Auto() {
        snelheid = 0;
        merk = "Toyota";
        kilometerstand = 23000;
    }

    public Auto(String merk) {
        this.merk = merk;
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        System.out.println(auto.snelheid);
        System.out.println(auto.merk);
        System.out.println(auto.kilometerstand);
        Auto tesla = new Auto("Tesla");
        System.out.println(tesla.snelheid);
        System.out.println(tesla.merk);
        System.out.println(tesla.kilometerstand);

    }
}
