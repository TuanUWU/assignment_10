package OOP_Nguoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    protected String fullName;
    protected Date birthDate;
    protected String gender;
    protected int idNumber;

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        fullName = sc.nextLine();

        System.out.print("Enter birth date (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        try {
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
            birthDate = new Date();
        }

        System.out.print("Enter gender: ");
        gender = sc.nextLine();

        System.out.print("Enter ID number: ");
        idNumber = sc.nextInt();
        sc.nextLine(); // Clear buffer
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Date: " + sdf.format(birthDate));
        System.out.println("Gender: " + gender);
        System.out.println("ID Number: " + idNumber);
    }
}
