package repetitive_structures;

import java.util.Scanner;

public class while_structure {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        do {
            x = sc.nextInt();
        } while (x != 0);


        sc.close();
    }

}
