package aula23;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        System.out.println("Números digitados: " + x + ", " + y );
        System.out.printf("Resultado = %.2f metros%n", x);

        String name = "Raven";
        int age = 31;
        double wage = 4000.0;
        System.out.printf("%s has %d yo and makes $%.2f per month%n", name, age, wage);

        Locale.setDefault(Locale.US);

    }
}
