import java.util.Scanner;

class arraysum {
    int sun = 0;
    int[] arr = new int[5];
}

public class classarraysum4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        arraysum obj = new arraysum();
        
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Number " + (i+1) + ": ");
            obj.arr[i] = s.nextInt();
            obj.sun += obj.arr[i];
        }
        
        System.out.println("Sum of array elements: " + obj.sun);
        s.close();
    }
}
