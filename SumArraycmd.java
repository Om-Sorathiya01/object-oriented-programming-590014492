public class SumArraycmd {
    public static void main(String[] args) {

        int sum = 0;

        // Loop through command line arguments
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        // Print the sum
        System.out.println("Sum of array elements = " + sum);
    }
}

