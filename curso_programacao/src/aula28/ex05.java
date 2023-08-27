package aula28;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double value1, value2, total;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        value1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        value2 = sc.nextDouble();

        total = (value1 * qtd1) + (value2 * qtd2);

        System.out.printf("VALOR A PAGAR: R$%.2f", total);
        sc.close();

    }

}
