package record;

import person.Doctor;
import person.Patient;

public class Diagnosis extends Record{

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
}
