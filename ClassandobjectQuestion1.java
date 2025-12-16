//Joy Ndinda J77-11541-2024
//program to compute coffee order
class CoffeeOrder {
    String size;
    double price;
    Public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }


    //method to display details
    void displayOrder() {
        System.out.println("Size: " + size + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Small", 2.5);
        CoffeeOrder order2 = new CoffeeOrder("Large", 4.0);

        order1.displayOrder();
        order2.displayOrder();
    }
}
