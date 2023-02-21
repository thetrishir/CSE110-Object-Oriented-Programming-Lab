package Lab9File;

import java.io.*;

public class Lab08_01_txt {

    public static void main(String[] args) throws Exception {
        File file = new File("Lab08_01.txt");
        if (file.exists()) {
            System.out.println(file + " already exists...");
        }

        try (
                PrintWriter in = new PrintWriter(file);) {
            for (int i = 0; i < 100; i++) {
                in.print(((int) (Math.random() * 1000) + 1));
                in.print(" ");
            }
            in.close();
            System.out.println("File write successful");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}