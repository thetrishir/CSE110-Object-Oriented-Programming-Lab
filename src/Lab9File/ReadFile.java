package Lab9File;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Lab08_01.txt");
        System.out.println("\n\nRead text File (" + file + "): ");
        Scanner inp = new Scanner(file);
        while (inp.hasNext()) {
            System.out.print(inp.next() + " ");
        }


        File file2 = new File("Lab08_02.dat");
        try (FileInputStream fis = new FileInputStream(file2);) {

            System.out.println("\n\nRead binary File (" + file2 + "): ");
            int byt;
            while ((byt = fis.read()) != -1) {
                System.out.print(byt);
                System.out.print(" ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        File file3 = new File("Lab08_03.dat");
        try (BufferedReader in = new BufferedReader(new FileReader(file3));
             DataInputStream out = new DataInputStream(new BufferedInputStream(new FileInputStream(file3)))) {

            System.out.println("\n\nRead binary File (" + file3 + "): ");
            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s + " ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        File file0 = new File("Lab08_04.dat");
        try {
            FileInputStream fis = new FileInputStream(new File("Lab08_04.dat"));
            BufferedInputStream reader = new BufferedInputStream(fis);
            System.out.println("\n\nRead binary File (int) (" + file0 + "): ");

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print(ch);
                //System.out.print((char)ch+" ");
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
