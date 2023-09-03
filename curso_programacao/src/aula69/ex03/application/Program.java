package aula69.ex03.application;

import aula69.ex03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student std = new Student();

        std.name = sc.nextLine();
        std.grade1 = sc.nextDouble();
        std.grade2 = sc.nextDouble();
        std.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + String.format("%.2f", std.sum()));
        System.out.println(std.test());

        sc.close();
    }
}
