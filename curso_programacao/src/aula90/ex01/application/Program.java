package aula90.ex01.application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? (Max 10): ");
        int n = sc.nextInt();

        if (n > 0) {
            if (n <= 10){
                int[] numbers = new int[n];

                for (int i=0; i<n; i++){
                    System.out.print("Write a number: ");
                    numbers[i] = sc.nextInt();
                }

                System.out.println("Negative numbers: ");
                for (int i=0; i<n; i++) {
                    if (numbers[i] < 0) {
                        System.out.printf("%d\n", numbers[i]);
                    }
                }
            } else {
                System.out.println("Too bigger!");
            }

        } else {
            System.out.println("The number has to be over than zero!");
        }

        sc.close();
    }
}
