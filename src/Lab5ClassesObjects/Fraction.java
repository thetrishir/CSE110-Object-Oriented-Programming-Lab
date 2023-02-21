package Lab5ClassesObjects;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "\n--\n" + denominator;
    }

    public void add(Fraction fraction) {
        double numerator = this.numerator * fraction.getDenominator() + this.denominator * fraction.getNumerator();
        double denominator = this.denominator * fraction.getDenominator();
        System.out.println("Add\n" + numerator + "/" + denominator);
    }

    public void sub(Fraction fraction) {
        double numerator = this.numerator * fraction.getDenominator() - this.denominator * fraction.getNumerator();
        double denominator = this.denominator * fraction.getDenominator();
        System.out.println("Sub\n" + numerator + "/" + denominator);
    }

    public void multi(Fraction fraction) {
        double numerator = this.numerator * fraction.getNumerator();
        double denominator = this.denominator * fraction.getDenominator();
        System.out.println("Multiplication\n" + numerator + "/" + denominator);
    }

    public void div(Fraction fraction) {
        double numerator = this.numerator * fraction.getNumerator();
        double denominator = this.denominator * fraction.getDenominator();
        System.out.println("Div\n" + numerator + "/" + denominator);
    }


}

class MainC {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,4);
        Fraction f2 = new Fraction(3,5);

        f1.add(f2);
        f1.sub(f2);
        f1.multi(f2);
        f1.div(f2);
    }
}
