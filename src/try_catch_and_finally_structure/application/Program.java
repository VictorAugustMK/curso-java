package try_catch_and_finally_structure.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method0();

        System.out.println("End of program");

    }

    public static void method0() {
        System.out.println("*** METHOD0 START ***");

        method1();

        System.out.println("*** METHOD0 END ***");
    }

    public static void method1() {

        System.out.println("*** METHOD1 START ***");

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error!");
        }

        System.out.println("*** METHOD1 END ***");

    }
}
