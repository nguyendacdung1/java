package com.company;

public class OddEventSum {
    public static void main(String[] args){
        int lowerbroud = 1, upperbroud=1000;
        int sumOdd=0;
        int sumEvent=0;
        int number=lowerbroud;
        while (number<=upperbroud){
            if (number % 2 ==0){
                sumEvent += number;
            }else {
                sumOdd +=number;
            }
            ++number;
        }
        System.out.println("The sum of odd numbers from" + lowerbroud + "to" +upperbroud);
        System.out.println("The sum of odd numbers from" + lowerbroud + "to" +upperbroud);
        System.out.println("The diffirence between the two  sums is" + (sumOdd - sumEvent));
    }
}
