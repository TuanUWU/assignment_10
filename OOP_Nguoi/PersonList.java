package OOP_Nguoi;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> list = new ArrayList<>();

    public void addPerson(Person person) {
        person.inputInfo();
        list.add(person);
    }

    public void displayList() {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Person p : list) {
                System.out.println("-----");
                p.displayInfo();
            }
        }
    }
}
