package Practice;

class java8 {
    int a = 5;
}

class java10 extends java8 {
    int a = 10;
    public void display() {
        System.out.println("Value of a in subclass: " + a);
        System.out.println("Value of a in superclass: " + super.a);
    }
}
public class java9 {
    public static void main(String[] args) {
        java10 a = new java10();
        a.display();
        
    }
}