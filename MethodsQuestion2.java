//Joy Ndinda J77-11541-2024
//Write amethod getFitnessLevel that takes an integer steps and return 
import java.util.Scanner;
public class FitnessTracker {

    //Method to determine fitness level
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your steps for today: ");
        int steps = scanner.nextInt();
        String fitnessLevel = getFitnessLevel(steps);
        System.out.println("Your fitness level: " + fitnessLevel);
    }
