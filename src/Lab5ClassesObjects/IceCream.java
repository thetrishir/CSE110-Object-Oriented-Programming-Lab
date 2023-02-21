package Lab5ClassesObjects;

public class IceCream {
    String icecreamType;
    String icecreamCompany;
    double icecreamPrice;

    IceCream(){
        this.icecreamPrice = 0;
    }
    IceCream(String icecreamType, String icecreamCompany, double icecreamPrice ){
        this.icecreamCompany = icecreamCompany;
        this.icecreamType = icecreamType;
        this.icecreamPrice = icecreamPrice;
    }
    public String toString(){
        return ("IcecreamType : " + icecreamType +
                "\nIcecreamCompany : " + icecreamCompany +
                "\nIcecreamPrice : " + icecreamPrice);
    }

    public boolean equals(double price){
        return (this.icecreamPrice == price) ? true : false;
    }

    public int compareTo(double price){
        if(this.icecreamPrice < price)
            return 1;
        else if(this.icecreamPrice == price)
            return 0;
        else
            return -1;
    }

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }
    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }
    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

    public String getIcecreamType() {
        return icecreamType;
    }
    public String getIcecreamCompany() {
        return icecreamCompany;
    }
    public double getIcecreamPrice() {
        return icecreamPrice;
    }


}


class Main1 {

    public static void main(String[] args) {
        IceCreamA i1 = new IceCreamA();
        IceCreamA i2 = new IceCreamA("Vanilla", "Igloo", 250);

        System.out.println("For no arg-Constructor");
        System.out.println(i1.toString());
        System.out.println("For arg-Constructor");
        System.out.println(i2.toString());

        System.out.println("Comparing i1 and i2");

        System.out.println(i1.equals(i2));

        System.out.println("Comparing price i1 and i2");
        System.out.println(i1.compareTo(i2.getIcecreamPrice()));
    }

}

