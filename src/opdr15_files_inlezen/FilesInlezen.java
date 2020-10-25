package opdr15_files_inlezen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {
    public static void main(String[] args) {
        File f = new File("Hello.txt");
        try {
            Scanner s = new Scanner(f);
            while (s.hasNextLine())
            {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fout bij inlezen bestand: "+e.getMessage());
        }

    }
}
