package begginer;

public class Fraction {

	private int numerator, denominator;
	 
    public Fraction() {
        numerator = denominator = 0;
    }
 
    public int getNumerator() {
        return numerator;
    }
 
    public void setNumerator(int num) {
        numerator = num;
    }
 
    public int getDenominator() {
        return denominator;
    }
 
    public void setDenominator(int den) {
        denominator = den;
    }
 
    public Fraction add(Fraction b) {
        if ((denominator == 0) || (b.denominator == 0)) {
            throw new IllegalArgumentException("invalid denominator");
        }
        int common = lcd(denominator, b.denominator);
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = b.convert(common);
        Fraction sum = new Fraction();
        sum.numerator = commonA.numerator + commonB.numerator;
        sum.denominator = common;
        sum = sum.reduce();
        return sum;
    }
 
    public Fraction subtract(Fraction b) {
        if ((denominator == 0) || (b.denominator == 0)) {
            throw new IllegalArgumentException("invalid denominator");
        }
        int common = lcd(denominator, b.denominator);
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = b.convert(common);
        Fraction diff = new Fraction();
        diff.numerator = commonA.numerator - commonB.numerator;
        diff.denominator = common;
        diff = diff.reduce();
        return diff;
    }
 
    private Fraction convert(int common) {
		// TODO Auto-generated method stub
		return null;
	}

	public Fraction multiply(Fraction b) {
        if ((denominator == 0) || (b.denominator == 0)) {
            throw new IllegalArgumentException("invalid denominator");
        }
        Fraction product = new Fraction();
        product.numerator = numerator * b.numerator;
        product.denominator = denominator * b.denominator;
        product = product.reduce();
        return product;
    }
 
    public Fraction divide(Fraction b) {
        if ((denominator == 0) || (b.numerator == 0)) {
            throw new IllegalArgumentException("invalid denominator");
        }
        Fraction result = new Fraction();
        result.numerator = numerator * b.denominator;
        result.denominator = denominator * b.numerator;
        result = result.reduce();
        return result;
    }
 
    public void input() {
 
        System.out.print("Please enter an integer for numerator: ");
 
        numerator = SavitchIn.readLineInt();
 
        do {
            System.out.print("Please enter a non-zero integer for denominator: ");
            denominator = SavitchIn.readLineInt();
            // make sure it is non-zero
            if (denominator == 0) {
                System.out.println("Invalid value.  Please try again.");
            }
        } while (denominator == 0);
    }
 
    public void output() {
        System.out.print(this);
    }
 
    public String toString() {
        String buffer = numerator + "/" + denominator;
        return buffer;
    }
 
    private int lcd(int denom1, int denom2) {
        int factor = denom1;
        while ((denom1 % denom2) != 0) {
            denom1 += factor;
        }
        return denom1;
    }
 
    private int gcd(int denom1, int denom2) {
        int factor = denom2;
        while (denom2 != 0) {
            factor = denom2;
            denom2 = denom1 % denom2;
            denom1 = factor;
        }
        return denom1;
    }
 
    private Fraction reduce() {
        Fraction result = new Fraction();
        int common = 0;
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);
        if (num > den) {
            common = gcd(num, den);
        } else if (num < den) {
            common = gcd(den, num);
        } else {
            common = num;
        }
 
        result.numerator = numerator / common;
        result.denominator = denominator / common;
        return result;
    }
 
    public static void main(String args[]) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
 
        f1.setNumerator(1);
        f1.setDenominator(3);
        f2.setNumerator(1);
        f2.setDenominator(6);
 
        Fraction result = new Fraction();
 
        result = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + result);
        result = f2.add(f1);
        System.out.println(f2 + " + " + f1 + " = " + result);
        System.out.println();
 
        result = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + result);
        result = f2.subtract(f1);
        System.out.println(f2 + " - " + f1 + " = " + result);
        System.out.println();
 
        System.out.println("Fraction 1:");
        f1.input();
        System.out.println();
        System.out.println("Fraction 2:");
        f2.input();
        System.out.println();
 
        result = f1.multiply(f2);
        f1.output();
        System.out.print(" * ");
        f2.output();
        System.out.print(" = ");
        result.output();
        System.out.println();
 
        result = f1.divide(f2);
        f1.output();
        System.out.print(" / ");
        f2.output();
        System.out.print(" = ");
        result.output();
        System.out.println();
    }
	
}
