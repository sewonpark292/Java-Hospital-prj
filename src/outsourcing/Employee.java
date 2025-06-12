package outsourcing;

import enums.Gender;
import enums.Part;
import person.Person;
import java.util.*;

public class Employee extends Person {
    private static ArrayList<Employee> employList = new ArrayList<>();
    private Part part;
    private static int employeeIDCounter=4000;
    private int employeeID = 4000;

    public Employee(String name, String phone, String birthdate, Gender gender, int age, Part part) {
        super(name, phone, birthdate, gender, age);
        this.part = part;
        this.employeeID = employeeIDCounter++;
    }

    public Part getPart() {
        return part;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setPart(String part) {
        this.part = Part.valueOf(part);
    }

    public static ArrayList<Employee> getEmployList() {
        return employList;
    }

    public void employInfo() {
        getInfo();
        System.out.println(", employeeID : " + employeeID + ", Part : " + part);
    }

    @Override
    public String toString() { //println(doctor)시에 toString()이 오버라이딩 되어 있어야 함
        return "Employee{" +
                "employeeID=" + getEmployeeID() +
                ", name='" + getName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", part=" + getPart() +
                '}';
    }
}
