public class classsuper1 {
    int n;
    classsuper1(int price) {
        this.n = price;
    }
    
    public static class tata extends classsuper1 {
        tata(int price) {
            super(price);
            System.out.println("Price of Tata harrier: " + n);
        }
        public static void main(String args[]) {
            tata t = new tata(2500000);
        }
    }
}