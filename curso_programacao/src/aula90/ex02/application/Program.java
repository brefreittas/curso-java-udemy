package aula90.ex02.application;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int values;
        double sum, avg;

        System.out.print("How many number will you enter? ");
        values = sc.nextInt();
        double[] numbers = new double[values];

        for (int i=0; i<numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }

        //adding up all the numbers entered
        sum = 0.0;
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }

        //calculating the average between the numbers
        avg = sum / numbers.length;

        //showing the results
        System.out.println("Values = ");
        for (int i=0; i<numbers.length; i++) {
            System.out.printf("%.1f", numbers[i]);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
