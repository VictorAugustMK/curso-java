package pom_generics_set_map.delimited_generics.application;

import pom_generics_set_map.delimited_generics.entities.Product;
import pom_generics_set_map.delimited_generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "C:\\repo\\curso-java\\src\\pom_generics_set_map\\delimited_generics\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] filds = line.split(",");

                list.add(new Product(filds[0], Double.parseDouble(filds[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.print("Most expensive: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
