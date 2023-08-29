package aula53;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n<0) {
            System.out.println("Número inválido!");
            n = sc.nextInt();
        }
        for (int i=1; i<=n; i++){
            int quadradoValor = i * i;
            int cuboValor = i * i * i;
            System.out.printf("%d %d %d%n", i, quadradoValor, cuboValor);
        }
        sc.close();
    }
}
