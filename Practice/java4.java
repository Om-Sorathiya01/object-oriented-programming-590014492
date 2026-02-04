package Practice;

class car{
    int speed;
    int mileage;
    String colour;

    public void display(){
        System.out.println("car speed is " + this.speed + " car mileage is " + this.mileage + " car colour is " + this.colour);
    }
}

public class java4 {

    public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car();
        car1.speed  = 100;
        car1.mileage = 23;
        car1.colour = "red";
        car2.speed = 80;
        car2.mileage = 20;
        car2.colour = "blue";

        car1.display();
        car2.display(); 
    }
}