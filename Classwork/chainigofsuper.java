package Classwork;

class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super();   // First super() call
        super();   // ❌ Second super() call (NOT allowed)
    }
}

public class chainigofsuper {
    public static void main(String[] args) {
        B obj = new B();
    }
}