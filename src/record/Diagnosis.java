package record;

import person.Doctor;
import person.Patient;

import java.io.Serializable;

public class Diagnosis extends Record implements Serializable {

    private Doctor doctor=p.getAssignedDoctor();
    private String diagnosisName;
    private String date;
    private String notes;

    public Diagnosis(Patient p, Doctor doctor, String diagnosisName, String date, String notes) {
        super(p);
        this.doctor = doctor;
        this.diagnosisName = diagnosisName;
        this.date = date;
        this.notes = notes;
    }

    public void getInfo(){
        System.out.println("[Diagnosis] : "+diagnosisName+", Date : "+date+", memo : "+notes + ", 의사 : " + doctor.getName());
    }
    @Override
    public String toString() {
        return "P.Name : " + p.getName() + " [Diagnosis : "+diagnosisName+", Date : "+date+", memo : "+notes + ", Doctor : " + doctor.getName() + "]";
    }
}
