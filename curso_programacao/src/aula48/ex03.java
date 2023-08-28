package aula48;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (code != 4) {
            switch (code) {
                case 1 -> alcool += 1;
                case 2 -> gasolina += 1;
                case 3 -> diesel += 1;
                default -> System.out.println("Por favor, digite um número válido.");
            }

            code = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool %d%n", alcool);
        System.out.printf("Gasolina %d%n", gasolina);
        System.out.printf("Diesel %d%n", diesel);

        sc.close();

    }

}
