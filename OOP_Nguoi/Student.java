package OOP_Nguoi;

import java.util.Scanner;

public class Student extends Person {

    private String studentId;
    private String trainingLevel;

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = sc.nextLine();
        evaluateTraining();
    }

    public void evaluateTraining() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select training level:");
        System.out.println("1. Excellent\n2. Good\n3. Average\n4. Poor");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 ->
                trainingLevel = "Excellent";
            case 2 ->
                trainingLevel = "Good";
            case 3 ->
                trainingLevel = "Average";
            case 4 ->
                trainingLevel = "Poor";
            default ->
                trainingLevel = "Unknown";
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Training Level: " + trainingLevel);
    }
}
