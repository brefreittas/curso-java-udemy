package aula28;

import java.util.Scanner;

public class ex06 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangulo = (a*c)/2;
        areaCirculo = pi * (c*c);
        areaTrapezio = ((a+b)*c)/2;
        areaQuadrado = b*b;
        areaRetangulo = a*b;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CÍRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPÉZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETÂNGULO: %.3f%n", areaRetangulo);

        sc.close();
    }

}
