package Practice;


public class java11 {
    int a; String s;
    java11(){
        a = 10;
        s = "Hello";

    }
    public void display(){
        System.out.println( a + s);
    }
}

class java1{
    public static void main(String[] args) {
        java11 obj = new java11();
        obj.display();
    }
}
