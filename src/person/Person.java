package person;
import hospital.Hospital;
import enums.Gender;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String phone;
    private String birthdate;
    private Gender gender;
    private int age;
    protected Hospital hospital;

    public Person(String name, String phone, String birthdate, Gender gender, int age){
        this.name=name;
        this.phone=phone;
        this.birthdate=birthdate;
        this.gender=gender;
        this.age=age;
    }
    public void getInfo(){
        System.out.print("Name : "+name+", Phone : "+phone+", Birthdate : "+birthdate+", Gender : "+gender+", Age : "+age);
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
}
