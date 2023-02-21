package Lab5ClassesObjects;

import java.util.Scanner;

public class IceCreamA {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    IceCreamA() {
        icecreamPrice = 20.5;
    }
    IceCreamA(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
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

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }
    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }
    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }


    public String toString() {
        return ("IcecreamType : " + icecreamType + "\nIcecreamCompany : " + icecreamCompany + "\nIcecreamPrice : " + icecreamPrice);
    }

    public boolean equals(double price) {
        return (this.icecreamPrice == price) ? true : false;
    }

    public int compareTo(double price) {
        return (this.icecreamPrice < price) ? 1 : (this.icecreamPrice == price) ? 0 : -1;

    }
}

class MainA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IceCream[] iceCreams = new IceCream[3];

        for (int i = 0; i < iceCreams.length; i++) {
            System.out.println("Please Input Type, Company, price for Icecream ");
            iceCreams[i] = new IceCream(input.next(), input.next(), input.nextDouble());
        }

        System.out.println("Input a Company Name To Search: ");
        String companyName = input.next();
        searchByCompany(companyName, iceCreams);
    }

    static void searchByCompany(String companyName, IceCream[] iceCreams){
        for (int i = 0; i < iceCreams.length; i++) {
            if(iceCreams[i].getIcecreamCompany().equals(companyName))
                System.out.println(iceCreams[i].toString());
        }
    }
}

