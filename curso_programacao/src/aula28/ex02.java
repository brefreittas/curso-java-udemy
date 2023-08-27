package aula28;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, a, pi = 3.14159;

        r = sc.nextDouble();
        a = pi * (r*r);

        System.out.printf("Com o raio de um círculo = %.2f, temos A = %.4f", r, a);

        sc.close();
    }
}
