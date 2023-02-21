package Lab8Exception;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Product {
    public void checkProduct(int weight) throws MyException {
        if (weight < 100) {
            throw new MyException("Product is invalid");
        } else System.out.println(weight);
    }

    public static void main(String[] args) {
        Product p = new Product();
        try {
            p.checkProduct(1000);
            p.checkProduct(20);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}