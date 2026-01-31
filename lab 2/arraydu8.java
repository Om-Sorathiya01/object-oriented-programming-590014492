import java.util.Scanner;

public class arraydu8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        boolean hasDuplicate = false;

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Duplicate values: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    System.out.println(arr[i]);
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicates");
        }
        
        scanner.close();
    }
}
