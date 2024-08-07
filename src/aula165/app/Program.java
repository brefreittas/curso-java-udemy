package aula165.app;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import aula165.entities.Circle;
import aula165.entities.Rectangle;
import aula165.entities.Shape;
import aula165.entities.enums.Color;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle? (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                shapes.add(new Circle(color, sc.nextDouble()));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }
        
        sc.close();
    }
}
