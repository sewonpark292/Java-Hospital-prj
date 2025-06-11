package person;
import enums.DeptName;
import enums.Gender;

import java.io.Serializable;
import java.util.*;

public class Doctor extends Person implements Serializable {
    private static int doctorIDCounter = 1000;
    private static ArrayList<Doctor> doctorList = new ArrayList<>();
    private int doctorID = 1000;
    private DeptName dept;

    public Doctor(String name, String phone, String birthdate, Gender gender, int age, DeptName dept) {
        super(name, phone, birthdate, gender, age);
        this.doctorID = doctorIDCounter++;
        this.dept = dept;
    }

    public int getDoctorID() {
        return doctorID;
    }
    public static ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }
    public DeptName getDept() {
        return dept;
    }

    public static Doctor findAssignDoctor(DeptName dept) {
        ArrayList<Doctor> deptDoctors = new ArrayList<>();
        Random rand=new Random();
        for (Doctor d : doctorList) {
            if (d.getDept().equals(dept)) {
                deptDoctors.add(d);
            }
        }
        return deptDoctors.get(rand.nextInt(deptDoctors.size()));
    }
    public void doctorInfo() {
        System.out.println(", Doctor ID : " + doctorID + ", Dept : " + dept );
    }

    @Override
    public String toString() { //println(doctor)시에 toString()이 오버라이딩 되어 있어야 함
        return "Doctor{" +
                "doctorID=" + getDoctorID() +
                ", name='" + getName() +
                ", phone='" + getPhone() +
                ", birthdate='" + getBirthdate() +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dept=" + getDept() +
                '}';
    }
}
