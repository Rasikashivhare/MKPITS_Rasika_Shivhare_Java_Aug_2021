//print the sum,difference and product of  two complex numbers by creating a class named 'Complex'
//with separate methods for each operation whose real and imaginary parts are entered by user .


import  java.util.Scanner;
 public class Main{
 public static void main(String []args)
 {
 ComplexNumber c1=new ComplexNumber(2,4);
  ComplexNumber c2=new ComplexNumber(3,5);

   ComplexNumber sum=c1.sum(c2);
   ComplexNumber difference=c1.difference(c2);
   System.out.println("first complex number:"+c1);
      System.out.println("second complex number:"+c2);
   System.out.println("sum of two  complex number:"+sum);
   System.out.println("difference complex number:"+ difference);
   }
   }
   class ComplexNumber
   {
   private final double real;
      private final double imaginary;

      public ComplexNumber(double real,double imaginary)
      {
      this.real=real;
      this.imaginary=imaginary;
      }
      public ComplexNumber sum(ComplexNumber other)
      {
      double r=this.real +other.real;
      double i=this.imaginary +other.imaginary;
      return new ComplexNumber(r,i);
      }
            public ComplexNumber difference(ComplexNumber other)
            {
            double r=this.real -other.real;
            double i=this.imaginary -other.imaginary;
            return new ComplexNumber(r,i);
            }
            public double getReal()
            {
            return real;
            }
            public double getImaginary()
            {
            return imaginary;
            }
            @override
            public String toString()
            {
            return real + "+" +imaginary+ "i";
            }
            }









