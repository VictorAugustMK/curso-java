package repetitive_structures;

import java.util.Scanner;

public class structure_for {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, i, sum, x;

        N = sc.nextInt();

        sum = 0;

        for (i = 0; i < N; i++) {

            x = sc.nextInt();
            sum = sum + x;

        }

        System.out.println(sum);

        sc.close();

    }

}
