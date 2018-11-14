package com.company;

import java.util.Scanner;

public class NuskaitymasIsEkrano {

   /* public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = reader.nextInt();
        System.out.println(number);
    }*/

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter first number: ");
        first = num.nextInt();
        System.out.println("Enter second number: ");
        second = num.nextInt();
        result = first + second;
        System.out.println("Result is - " + result);
    }
}
