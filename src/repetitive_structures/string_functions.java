package repetitive_structures;

public class string_functions {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2,9);
        String s6 = original.replace('a','x');
        String s7 = original.replace("abc","xy");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("ORIGINAL: " + original);
        System.out.println("Lower Case: " + s1);
        System.out.println("Upper Case: " + s2);
        System.out.println("Trim: " + s3);
        System.out.println("Substring: " + s4);
        System.out.println("Substring(2,9): " + s5);
        System.out.println("Replace: " + s6);
        System.out.println("Replace: " + s7);
        System.out.println("IndexOf: " + i);
        System.out.println("LastIndexOf: " + j);

    }
}
