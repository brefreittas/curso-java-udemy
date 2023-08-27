package aula36;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();;

        if (num < 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Não negativo.");
        }

    }

}
