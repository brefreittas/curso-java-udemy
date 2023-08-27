package aula36;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int code = sc.nextInt();
        int qtd = sc.nextInt();
        double total;

        if (code == 1) {
            total = 4.0 * qtd;
        } else if (code == 2) {
            total = 4.50 * qtd;
        } else if (code == 3)  {
            total = 5.0 * qtd;
        } else if (code == 4) {
            total = 2.0 * qtd;
        } else {
            total = 1.5 * qtd;
        }


        System.out.printf("Total: R$%.2f", total);

        sc.close();

    }
}
