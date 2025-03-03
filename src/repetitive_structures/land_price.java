package repetitive_structures;

import java.util.Locale;
import java.util.Scanner;

public class land_price {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double largura, comprimento, metroQuadrado, area, preco;

        Scanner sc = new Scanner(System.in);

        largura = sc.nextDouble();
        comprimento = sc.nextDouble();

        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;

        preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}