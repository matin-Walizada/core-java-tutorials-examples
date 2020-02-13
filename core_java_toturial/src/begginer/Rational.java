package begginer;

import java.util.Scanner;

public class Rational{
 private int numerator, denominator;

 // Sets up Fraction number by ensuring a non-zero denominator
 // and making only the numerator signed
 public Rational(int numer, int denom)
 {
  if(denom==0)
  {
   denom = 1;
  }
  //Make the numerator store the sign
  if(denom<0)
  {
   numer*=-1;
   denom*=-1;
  }
 
  numerator = numer;
  denominator = denom;
  reduce();
 }

 // Returns the numerator of the Fraction number
 public int getNumerator()
 {
  return numerator;
 }

 // Reutrns teh denominator of the Fraction number
 public int getDenominator()
 {
  return denominator;
 }

 //Returns the reciprocal of given Fraction number
 public Rational reciprocal()
 {
  return new Rational(denominator, numerator);
 }

 // Adds this Fraction number to the one passed as parameter.
 // A common denominator is find by multiplying the
 // individual denominators.
 public Rational add (Rational op2)
 {
  int commonDenominator = denominator * op2.getDenominator();
  int numerator1 = numerator*op2.getDenominator();
  int numerator2 = op2.getNumerator()*denominator;
  int sum = numerator1 + numerator2;

  return new Rational(sum,commonDenominator);
 }

 // Subtracts the Fraction number passed as parameter
 // from this Fraction number
 public Rational subtract(Rational op2)
 {
  int commonDenominator = denominator * op2.getDenominator();
  int numerator1 = numerator*op2.getDenominator();
  int numerator2 = op2.getNumerator()*denominator;
  int difference = numerator1 - numerator2;

  return new Rational(difference, commonDenominator);
 }

 // Multiplies this Fraction number by the one passed
 // as parameter
 public Rational multiply(Rational op2)
 {
  int numer = numerator*op2.getNumerator();
  int denom = denominator*op2.getDenominator();
  return new Rational(numer,denom);
 }

 // Divide this Fraction number by the one passed
 // as parameter by multiplying by the reciprocal
 // of the second Fraction
 public Rational divide(Rational op2)
 {
  return multiply(op2.reciprocal());
 }

 // Returns the Fraction number as a String
 public String toString()
 {
  String result;

  if(numerator==0)
  {
   result = "0";
  }
  else
  {
   if(denominator==1)
   {
    result = numerator + "";
   }
   else
   {
    result = numerator + "/" + denominator;
   }
  }
  return result;
 }

 // Reduces the Fraction number by dividing both
 // numerator and denominator by their common divisor
 public void reduce()
 {
  if(numerator!=0)
  {
   int common = gcd(Math.abs(numerator),denominator);
   numerator/=common;
   denominator/=common;
  }
 }

 // computes and returns the greatest common divisor of
 // the two positive parameters. Use Euclid's algorithm
 private int gcd(int num1, int num2)
 {
  while(num1!=num2)
  {
   if(num1>num2)
   {
    num1 -= num2;
   }
   else
   {
    num2 -= num1;
   }
  }
  return num1;
 }
 
 
 public static void main(String[] args)
 {
   System.out.println("//--------------------------//");
   System.out.println("// OPERATIONS ON FRACTIONS: //");
   System.out.println("// Use '+' for Addition,    //");
   System.out.println("// '-' for  Subtraction,   //");
   System.out.println("// '*' for Multiplication   //");
   System.out.println("// '/' for Division         //");
   System.out.println("//--------------------------//");
   Scanner sc = new Scanner(System.in);
   char token = 'Y';
   Rational result = new Rational(0,1);
   String frac1, frac2;
   char op;
   while(token=='Y')
   {
     System.out.println("Fraction-1: 'num/denom'");
     frac1 = sc.nextLine();
     System.out.println("Operation symbol:(+,-,*,/)");
     op = sc.nextLine().charAt(0);
     System.out.println("Fraction-2: 'num/denom'");
     frac2 = sc.nextLine(); 
     String[] f1 = frac1.split("/");
     String[] f2 = frac2.split("/");
     int num1 = Integer.parseInt(f1[0]);
     int den1 = Integer.parseInt(f1[1]);
     int num2 = Integer.parseInt(f2[0]);
     int den2 = Integer.parseInt(f2[1]);
     // create Fraction numbers from fractions
     Rational fraction1 = new Rational(num1,den1);
     Rational fraction2 = new Rational(num2,den2);
     switch(op)
     {
       case '+': result = fraction1.add(fraction2);
                 break;
       case '-': result = fraction1.subtract(fraction2);
                 break;
       case '*': result = fraction1.multiply(fraction2);
                 break;
       case '/': result = fraction1.divide(fraction2);
     }
     System.out.println("//------------------");
     System.out.printf("//    Result: %s   \n",result);
     System.out.println("//------------------");
     System.out.println();
     System.out.println("To quit, enter 'q'.");
     System.out.println("To continue, enter 'Y'.");
     token = sc.nextLine().charAt(0);
   }
 }
}
