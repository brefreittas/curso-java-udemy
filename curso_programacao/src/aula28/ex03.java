package aula28;

import java.util.Scanner;

public class ex03 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diff;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diff = (A*B) - (C*D);

        System.out.println("Diferença = " + diff);

        sc.close();

    }
}
