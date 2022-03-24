package com.company;

public class ArithmeticTest {
    public static void main(String[] args){
        int number1 = 98;
        int number2=5;
        int sum, diffirence,product,quotient,remainder;
        sum=number1+number2;
        diffirence=number1-number2;
        product=number1*number2;
        quotient=number1/number2;
        remainder=number1%number2;

        System.out.print("The Sum,Diffirence,Product,Quotient,Remainder of");
        System.out.print(number1);
        System.out.print(" And ");
        System.out.print(number2);
        System.out.print(" Are ");
        System.out.print(sum);
        System.out.print(", ");
        System.out.print(diffirence);
        System.out.print(", ");
        System.out.print(product);
        System.out.print(", ");
        System.out.print(quotient);
        System.out.print(",And ");
        System.out.println(remainder);
        ++number1;
        --number2;
        System.out.println("Number1 after increment is" + number1);
        System.out.println("Number1 after increment is" + number2);
        quotient=number1/number2;
        System.out.println("The new quotient of" + number1 +"and"+number2
        +"is" +quotient);
    }
}
