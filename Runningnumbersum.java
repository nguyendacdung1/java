package com.company;

public class Runningnumbersum {
    public static void main(String[] args){
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int number = lowerbound;
        while (number<upperbound){
            sum=sum+number;
            ++number;
        }
        System.out.print("The Sum from"+lowerbound+"to"+upperbound+"is"+sum);
    }
}
