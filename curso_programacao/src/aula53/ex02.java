package aula53;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int somaIn = 0;
        int somaOut = 0;

        for(int y = 0; y<n; y++) {
            int x = sc.nextInt();

            if (x>=10 && x<=20) {
                somaIn+= 1;
            } else {
                somaOut+= 1;
            }

        }

        System.out.printf("%d In%n", somaIn);
        System.out.printf("%d Out%n", somaOut);

        sc.close();
    }
}
