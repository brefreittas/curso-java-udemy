package aula90.application;

import aula90.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0.0;

        Product[] vect = new Product[n];

        for (int i=0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);

            sum += vect[i].getPrice();
        }

        double avg = sum / n;
        System.out.printf("Average price: $%.2f%n", avg);

        sc.close();
    }
}
