//Joy Ndinda J77-11541-2024
// Parent class Vehicle
class Vehicle {
    String brand;   // brand of the vehicle
    int year;       // year of manufacture
}

// Child class Car inherits from Vehicle
class Car extends Vehicle {
    int seats;      // number of seats in the car

    // Method to display details of the car
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Seats: " + seats);
    }
}

// Main class to test inheritance
public class CarRental {
    public static void main(String[] args) {
        Car myCar = new Car();   // create Car object
        myCar.brand = "Toyota";  // set brand
        myCar.year = 2022;       // set year
        myCar.seats = 5;         // set seats

        myCar.showDetails();     // call method to display details
    }
}
