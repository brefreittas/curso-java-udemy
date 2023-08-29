package aula53;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=n;i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            if (x2==0) {
                System.out.println("Divisão impossível");
            } else {
                double div = (double) x1/x2;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
