package opdr12_main_methode;

/**
 * Om output te krijgen in IntelliJ moet je in de applicatie menu
 *  Run ->  Edit Configurations
 * een paar parameters meegeven in het veld
 * 'Program arguments'
 * bijv:  'maan roos vis 1 2 3'
 */
public class MainMethode {
    public static void main(String[] args) {
        for (var s: args) {
            System.out.println(s);
        }
    }
}
