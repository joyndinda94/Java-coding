//Joy Ndinda J77-11541-2024
//program to compute price and discount
import java.util.scanner;

class Product {
    private String name;
    private double price;
    
    //constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Apply discount
    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    //Return updated price
    double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product("Laptop", 1000);
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        product.applyDiscount(discount);
        System.out.println("New price: $" + product.getPrice());
    }
}
