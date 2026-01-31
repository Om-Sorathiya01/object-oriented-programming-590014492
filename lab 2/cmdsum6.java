public class cmdsum6 {
    public static void main(String[] args) {

        int sum = 0;

        // Convert command line arguments to integers
        for(int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum = sum + num;
        }

        System.out.println("Sum of array elements = " + sum);
    }
}