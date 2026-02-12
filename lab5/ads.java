package lab5;

abstract class Sample{
    int a=10;
    void f(){
        System.out.println(a);
    }
    abstract void f2();
}

class Child extends Sample{
    void show(){
        super.f();
    }
    void f2(){
        System.out.println("done");
    }
}

public class ads {
    public static void main(String[] args) {
        Child s=new Child();
        s.show();
        s.f2();
    }
}
