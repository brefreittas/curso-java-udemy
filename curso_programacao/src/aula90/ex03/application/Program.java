package aula90.ex03.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sumH, sumP, avgH, perUnder;

        System.out.print("How many people will be included? ");
        n = sc.nextInt();

        //creating arrays for each data entered
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for(int i=0; i<n; i++) {

            System.out.printf("Data from %d person\n", i+1);

            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        sumH = 0.0;
        sumP = 0.0;
        for (int i=0; i<n; i++) {
            //adding people under 16yo
            if (age[i]<16) {
                sumP++;
            }

            //catching and adding the height
            sumH += height[i];
        }

        //calculating the average height
        avgH = sumH / height.length;

        //calculating the percentage of under 16yo people
        perUnder = sumP * 100 / n;

        System.out.printf("Average height = %.2f\n", avgH);
        System.out.printf("People under 16 years old = %.1f%%\n", perUnder);

        //catching the name of people under 16yo
        for (int i=0; i<n; i++) {
            if(age[i]<16) {
                System.out.printf("%s\n", name[i]);
            }
        }

        sc.close();
    }
}
