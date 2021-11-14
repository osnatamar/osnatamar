package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number;
        int results;
        number = scanner.nextInt();
        results = number;
        if (number > 0) {
            System.out.println("The number"   + results);
        } else {
            System.out.println("The number is"   + number * -1);
        }

    }
    }