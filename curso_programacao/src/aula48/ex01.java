package aula48;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha inválida");
            password = sc.nextInt();
        }

        System.out.println("Accesso Permitido.");

        sc.close();
    }

}
