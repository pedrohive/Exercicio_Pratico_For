package org.example;

import java.util.Scanner;

public class Main {

    static void main (String[] args){

        int a, b;

        Scanner sc = new Scanner(System.in);
        int i;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Total da soma: " + (a+b));
        System.out.println("Quantas vezes o sistema deverá repetir: " + (a+b));

        for (i = 0; i < a + b; i++){
            System.out.println((i + 1) + "º Repetição.");
        }

        System.out.println("O valor foi contado " + i + " vezes.");
    }
}