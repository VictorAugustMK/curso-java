package abstraction_class.abstract_methods.application;

import abstraction_class.abstract_methods.entities.Cicle;
import abstraction_class.abstract_methods.entities.Rectangle;
import abstraction_class.abstract_methods.entities.Shape;
import abstraction_class.abstract_methods.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Cicle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else {
                System.out.print("Width: ");
                double radius = sc.nextDouble();
                list.add(new Cicle(color, radius));
            }
        }

        System.out.println("Shape areas: ");
        for (Shape shape : list) {
            System.out.print(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}
