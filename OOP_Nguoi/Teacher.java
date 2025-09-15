package OOP_Nguoi;

import java.util.Scanner;

public class Teacher extends Person {

    private String teacherId;
    private String commendationLevel;

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teacher ID: ");
        teacherId = sc.nextLine();
        assignCommendation();
    }

    public void assignCommendation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select commendation level:");
        System.out.println("1. Type A\n2. Type B\n3. Type C");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 ->
                commendationLevel = "Type A";
            case 2 ->
                commendationLevel = "Type B";
            case 3 ->
                commendationLevel = "Type C";
            default ->
                commendationLevel = "Unknown";
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Commendation Level: " + commendationLevel);
    }
}
