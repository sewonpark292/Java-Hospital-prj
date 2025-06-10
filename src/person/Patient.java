package person;

import enums.DeptName;
import enums.Gender;

import java.util.ArrayList;

public class Patient extends Person {
    private static int patientIDCounter=3000;
    private int patientID=3000;
    private DeptName dept;
    private Doctor assignedDoctor;
    private Nurse assignedNurse;
    private static ArrayList<Patient> patientList= new ArrayList<>();

    public Patient(String name, String phone, String birthdate, Gender gender, int age, DeptName dept) {
        super(name, phone, birthdate, gender, age);
        this.patientID=patientIDCounter++;
        this.dept=dept;
        this.assignedDoctor=Doctor.findAssignDoctor(dept); //진료과에 맞게 할당
        this.assignedNurse=Nurse.findAssignNurse(dept); //역시 같이.
    }

    public int getPatientID(){return patientID;}
    public static ArrayList<Patient> getPatientList(){
        return patientList;
    }
    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }
    public Nurse getAssignedNurse() {
        return assignedNurse;
    }
    public String patientInfo(){
        return "Patient ID : "+patientID+", Name : "+getName()
                +", Dept Name : "+dept
                +", Assigned Doctor : "+assignedDoctor.getName()
                +", Assigned Nurse : "+assignedNurse.getName()+"\n";
    }
}
