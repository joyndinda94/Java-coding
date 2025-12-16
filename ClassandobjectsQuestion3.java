//Joy Ndinda J77-11541-2024
//program to take mainapp input, compute grades and compute details

import java.util.Scanner;

    //student class
    class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student: " + name + ", Marks: " + marks);
    }
}

class GradeCalculator {
    String calculateGrade(double marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }
}

//mainapp class
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(name, marks);
        GradeCalculator gc = new GradeCalculator();

        String grade = gc.calculateGrade(marks);

        student.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
