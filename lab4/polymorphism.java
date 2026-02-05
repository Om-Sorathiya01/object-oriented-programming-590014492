package lab4;
   class subject{
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
   }

class bmw extends subject{
    @Override
    int sum(int a, int b){
        return a + b;
    }
}
public class polymorphism {
    
public static void main(String[] args) {
    subject obj = new subject();
    System.out.println(obj.sum(5,10));
    
    bmw obj1 = new bmw();
    System.out.println(obj1.sum(15,15));
    
    System.out.println(obj.sum(45,75,20)); 
}
}
