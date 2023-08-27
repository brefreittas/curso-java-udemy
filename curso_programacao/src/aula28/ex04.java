package aula28;

import java.util.Scanner;

public class ex04 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, hoursWorked;
        double salaryPerHour, salary;

        num = sc.nextInt();
        hoursWorked = sc.nextInt();
        salaryPerHour = sc.nextDouble();
        salary = salaryPerHour * hoursWorked;

        System.out.printf("NUMBER = %d%n", num);
        System.out.printf("SALARY = U$ %.2f", salary);

        sc.close();

    }

}
