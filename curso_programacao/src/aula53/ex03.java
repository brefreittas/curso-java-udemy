package aula53;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = sc.nextInt();
        for (int i=0;i<=chances;i++){
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double media = (x1*2 + x2*3 + x3*5)/10;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
