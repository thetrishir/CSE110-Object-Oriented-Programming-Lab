package Lab9File;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class List {
    int index, maxSize=10;
    int[] data = new int[maxSize];

    public List() {
        maxSize = 10;
        index = -1;
    }

    public List(int max) {
        maxSize = max;
        index = -1;
    }

    public void push(int data) {
        index++;
        this.data[index] = data;
    }

    public void pop() {
        this.data[index] = 0;
        index--;
    }

    public void display() {
        System.out.println(data);
    }

    public int top() {
        return data[index];
    }
}
class test{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        File file = new File("Lab08_04.dat");
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + "File does not exist...");
            System.exit(1);
        }

        List[] l= new List[5];

        try{
            FileOutputStream output = new FileOutputStream(file);
            DataOutputStream out= new DataOutputStream(output);
            //PrintWriter out = new PrintWriter(file);
            for (int i = 0; i < 5; i++) {
                l[i]=new List();
                l[i].push((int) (Math.random() * 100) + 1);
                //out.print(l[i].top()+" ");
                out.writeInt(l[i].top());
                //out.writeUTF(" ");
            }
            output.close();
            System.out.println("File write successful");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}