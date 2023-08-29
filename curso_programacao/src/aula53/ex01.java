package aula53;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 1000) {
            System.out.println("Insira um número menor!");
        }
        System.out.printf("Todos os números pares de %d até %d:%n", 0, x);
        for(int i=1; i<=x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
