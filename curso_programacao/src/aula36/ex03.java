package aula36;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }

        sc.close();

    }

}
