class Computer {

    public double calculatePrice(double basePrice) {
        System.out.println("[Using basePrice only]");
        return basePrice;
    }

    public double calculatePrice(double basePrice, double tax) {
        System.out.println("[Using basePrice + tax]");
        return basePrice + tax;
    }

    public double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("[Using basePrice + tax + discount]");
        return basePrice + tax - discount; 
    }
}

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();

        double price1 = comp.calculatePrice(1000.0);
        System.out.println("Final Price = " + price1 + "\n");

        double price2 = comp.calculatePrice(1000.0, 100.0);
        System.out.println("Final Price = " + price2 + "\n");

        double price3 = comp.calculatePrice(1000.0, 100.0, 50.0);
        System.out.println("Final Price = " + price3 + "\n");
    }
}
