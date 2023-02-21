package Lab8Exception;
public class D {
    public static void main(String[] args) {
        int[] a = new int[5];
        try{
            a[5]=30/0;
            System.out.println(a[10]);
            String s = null;
            System.out.println(s);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
