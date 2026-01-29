public class arraydu {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2, 3};
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
    }
}
