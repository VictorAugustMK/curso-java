package conditions_logics;

import java.util.Scanner;

public class condicional_ternaria {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        double price, discount;

       price = 34.05;

       discount = price < 20.00 ? price * 0.1 : price * 0.5;

       System.out.print(discount);

       sc.close();
    }

}
