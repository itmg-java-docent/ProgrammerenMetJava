package opdr15_files_inlezen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen2 {
    public static void main(String[] args) {
        try {
            bestandInlezen("Hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void bestandInlezen(String bestandsNaam) throws FileNotFoundException{
        File f = new File(bestandsNaam);
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    }
}
