package Lab8Exception;


public class C {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 30 / 0;
            System.out.println(a[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e);
        }


        try {
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }

        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.err.println(e);
        }
    }
}
