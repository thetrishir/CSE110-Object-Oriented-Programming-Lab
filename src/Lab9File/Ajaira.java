package Lab9File;

public class NumberComputator {
    public void printFactorial(int n){
        int f=1;
        for (int i = 0; i < n; i++) {
            f=f*i;
        }
        System.out.println("factorial: "+f);
    }

}
class Thread1 extends Thread {
    public Thread1(String name) {
        super(name);
    }
}
class Thread2 extends Thread {
        public Thread2(String name) {
            super(name);
        }

}
    class MultiProgrammingDemo{
    public static void main(String[] args){
Thread1 t1= new Thread(new NumberComputator());
t1.pri
    }
}