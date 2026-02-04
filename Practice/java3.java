package Practice;

class Car{
    int mileage;
    int speed;
    public void display(){
        System.out.println("car mileage is " + this.mileage);
        System.out.println("car speed is " + this.speed);
    }
    
}

public class java3 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        car1.mileage=20;
        car.speed=80;

        car.display();
        car1.display();

    }
    
}
