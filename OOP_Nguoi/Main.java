package OOP_Nguoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList personList = new PersonList();
        int choice;

        do {
            System.out.println("Choose type to input:");
            System.out.println("1. Student\n2. Teacher");
            int type = sc.nextInt();
            sc.nextLine(); // Clear buffer

            Person person = (type == 1) ? new Student() : new Teacher();
            personList.addPerson(person);

            System.out.println("Do you want to continue? (1-Yes, 0-No)");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("\nDisplaying all entries:");
        personList.displayList();
    }
}
