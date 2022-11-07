package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void checkPrime(int number){
        int count=0;
        for(int i=2;i<1000;i++) {
            if (number% i == 0) {
                count++;
            }
        }
        if (count==1) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number between 1 to 1000 :");
        int number=sc.nextInt();
        checkPrime(number);


    }
}

