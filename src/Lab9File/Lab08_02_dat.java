package Lab9File;

import java.io.*;

public class Lab08_02_dat {

    public static void main(String[] args) throws Exception {
        File file = new File("Lab08_02.dat");
        if (file.exists()) {
            System.out.println(file + " already exists...");
        }

        try(DataOutputStream out= new DataOutputStream(new FileOutputStream(file, true));){

            for (int i = 0; i < 100; i++) {
                out.writeInt((int) (Math.random() * 1000) + 1);
                out.writeUTF(" ");
            }
            out.close();
            System.out.println("File write successful");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}