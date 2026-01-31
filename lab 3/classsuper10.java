class classsuper10 {
    int n;

    // Parent constructor
    classsuper10(int price) {
        this.n = price;   // using THIS
    }
}

// Child class
class tata extends classsuper10 {

    tata(int price) {
        super(price);   // using SUPER
        System.out.println("Price of Tata Harrier: " + n);
    }

    public static void main(String args[]) {
        tata t = new tata(2500000);
    }
}