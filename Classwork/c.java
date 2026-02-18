import java.util.Scanner;

class Employee {
    String name;
    int age;
    float salary;
}

public class c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        try {
            System.out.print("Enter name: ");
            emp.name = sc.nextLine();

            System.out.print("Enter age: ");
            emp.age = sc.nextInt();

            System.out.print("Enter salary: ");
            emp.salary = sc.nextFloat();

            if (emp.name.length() <= 15) {

                if (emp.age > 18) {

                    if (emp.salary > 80000) {

                        System.out.println("\nData inserted successfully!");
                        System.out.println("Name: " + emp.name);
                        System.out.println("Age: " + emp.age);
                        System.out.println("Salary: " + emp.salary);

                    } else {
                        System.out.println("\n- Salary must be greater than 80000");
                    }

                } else {
                    System.out.println("\n- Age must be greater than 18");
                }

            } else {
                System.out.println("\n- Name should not exceed 15 characters");
            }
        }
        catch (java.lang.Exception e) {
            System.out.println("\nInvalid input! Please enter correct data type.");
        }

        sc.close();
    }
}