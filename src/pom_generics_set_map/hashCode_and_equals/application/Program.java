package pom_generics_set_map.hashCode_and_equals.application;

import pom_generics_set_map.hashCode_and_equals.entities.Client;

public class Program {

    public static void main(String[] args) {

        Client c1 = new Client("Bob", "maria@g.com");
        Client c2 = new Client("Bob", "maria@g.com");

        String s1 = "test";
        String s2 = "test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);

    }

}
