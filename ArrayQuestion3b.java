//Joy Ndinda J77-11541-2024
// Question 3.2 — 3D Array: Warehouse stock tracking, print all values, and total for Warehouse 2

public class WarehouseStockTracking {
    public static void main(String[] args) {
        // Declare and initialize 3D array
        int[][][] stock = {
            { {50, 30, 20}, {40, 25, 15} },  // Warehouse 1
            { {60, 35, 25}, {55, 28, 18} }   // Warehouse 2
        };

        // 1. Print all stock values using 3 nested loops
        System.out.println("Warehouse Stock:");
        for (int warehouse = 0; warehouse < stock.length; warehouse++) {
            System.out.println("Warehouse " + (warehouse + 1) + ":");
            for (int section = 0; section < stock[warehouse].length; section++) {
                System.out.print("Section " + (section + 1) + ": ");
                for (int product = 0; product < stock[warehouse][section].length; product++) {
                    System.out.print(stock[warehouse][section][product] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // 2. Calculate total stock in Warehouse 2
        int totalWarehouse2 = 0;
        for (int[][] section : stock[1]) {
            for (int product : section) {
                totalWarehouse2 += product;
            }
        }
        System.out.println("Total stock in Warehouse 2: " + totalWarehouse2);
    }
}
