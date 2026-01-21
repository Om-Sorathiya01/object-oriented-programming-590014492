import java.util.Scanner;

public class firstcode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str[] = new String[5];
        System.out.println("Enter 5 strings:");
        for(int i=0; i<5; i++) {
            System.out.print("Element " + (i+1) + ": ");
            str[i] = s.nextLine();
        }
        System.out.println("\nYou have entered:");    
        for(int i=0; i<5; i++) {
            System.out.println(str[i]);
        }
        s.close();
    }
}
