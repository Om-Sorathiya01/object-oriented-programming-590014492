import java.util.Scanner;

public class labwork7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = s.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter values for array:");
        for(int i = 0; i < size; i++) {
            System.out.print("element[" + i + "] = ");
            arr[i] = s.nextInt();
        }
        
        System.out.println("\nArray elements:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        
        System.out.println("The frequency of the elements are = ");
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = Integer.MIN_VALUE; 
                }
            }
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.println(arr[i] + " : " + count);
            }
        }
        
        s.close();
    }
}
