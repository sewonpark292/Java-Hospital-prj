package outsorcing;

import enums.Gender;
import enums.Part;
import person.Person;
import java.util.*;

public class Employee extends Person {
    private static ArrayList<Employee> employList = new ArrayList<>();
    private Part part;

    public Employee(String name, String phone, String birthdate, Gender gender, int age, Part part) {
        super(name, phone, birthdate, gender, age);
        this.part = part;

        employList.add(this);
    }

    public Part getPart() {
        return part;
    }

    public static ArrayList<Employee> getEmployList() {
        return employList;
    }

    public void employInfo() {
        getInfo();
        System.out.println(", Part : " + part);
    }
}
