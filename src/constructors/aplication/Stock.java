package constructors.aplication;

import constructors.entity.Product;

import java.util.Locale;
import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computador");
        System.out.println("Updated name: " + product.getName());

        product.setPrice(1200);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.print("Updated data: " + product);

        sc.close();
    }
}
