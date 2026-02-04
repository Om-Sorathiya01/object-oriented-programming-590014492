package Practice;

public class java8 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i < args.length;i++){
            int num = Integer.parseInt(args[i]);
            sum = sum + num;
            System.out.println("Sum of array elements = " + sum);
        }
    
        }
    }

