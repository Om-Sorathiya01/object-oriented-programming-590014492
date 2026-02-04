package Practice;

public class java6 {
    int[] marks = new int[5];
    char[] grades = new char[5];
    public static void main(String[] args) {
        java6 obj = new java6();
        obj.marks[0] = 95;
        obj.marks[1] = 85;
        obj.marks[2] = 75;
        obj.marks[3] = 65;
        obj.marks[4] = 55;

        for(int i=0; i<obj.marks.length; i++){
            System.out.println("Marks of student " + (i+1) + " is: " + obj.marks[i]);
        }
    }
}
