import java.util.Scanner;

public class hello {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hello Koder");

        int n;
        int [] arr = new int[5];

        System.out.println("Enter the value of n");
        n = s.nextInt();

        System.out.println("Enter elements in array");
        for(int i=0;i<5;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("The value of n is: " + n);
        System.out.println("Array elements are:");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        s.close();
    }
}