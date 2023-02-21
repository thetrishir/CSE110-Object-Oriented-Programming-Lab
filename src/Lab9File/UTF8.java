package Lab9File;

import java.io.*;
import java.util.Scanner;

public class UTF8 {
    public static void main(String[] args) throws IOException {
        File file = new File("Lab08_03.txt");
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + "File does not exist...");
            System.exit(1);
        }

        File dFile = new File("Lab08_03.dat");
        if (!dFile.exists()) {
            System.out.println(dFile.getAbsolutePath() + "File does not exist...");
            System.exit(1);
        }

        try (BufferedReader in = new BufferedReader(new FileReader(file));
             DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dFile)))) {

            String s;
            while ((s = in.readLine()) != null) {
                s += "\n";
                out.writeUTF(s);
            }
            System.out.println("File write successful");
        }

    }
}