import java.util.Scanner;

public class car5 {
    int modelYear;
    int mileage;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        car5 c1 = new car5();
        car5 c2 = new car5();
        
        System.out.print("Enter Car 1 Model Year: ");
        c1.modelYear = scanner.nextInt();
        
        System.out.print("Enter Car 1 Mileage: ");
        c1.mileage = scanner.nextInt();
        
        System.out.print("Enter Car 2 Model Year: ");
        c2.modelYear = scanner.nextInt();
        
        System.out.print("Enter Car 2 Mileage: ");
        c2.mileage = scanner.nextInt();
        
        System.out.println("Car 1 Model Year: " + c1.modelYear + ", Mileage: " + c1.mileage);
        System.out.println("Car 2 Model Year: " + c2.modelYear + ", Mileage: " + c2.mileage);
        
        scanner.close();
    }
}
