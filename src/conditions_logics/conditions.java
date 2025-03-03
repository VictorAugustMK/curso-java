package conditions_logics;

import java.util.Scanner;

public class conditions {

    public static void main (String[] arg){

        int hora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("Bom dia!");
        }
        else {
            System.out.println("Bom tarde!");
        }

        sc.close();
    }

}
