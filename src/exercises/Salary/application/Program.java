package exercises.Salary.application;

import exercises.Salary.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();


        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.printf("Emplyoee #%d: %n", i);

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            String name = sc.next();

            sc.next();

            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name,  salary));

        }

        System.out.print("Enter the employee id tha will have salary increase: ");
        int increaseId = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == increaseId).findFirst().orElse(null);
        
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee obj : list) {
            System.out.println(obj);
        }

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
