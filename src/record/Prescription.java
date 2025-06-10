package record;

import person.Doctor;
import person.Patient;

public class Prescription extends Record{

    private String medicationName; //약 이름
    private String dosage; //용량
    private String frequency;
    private String date;
    private Doctor doctor=p.getAssignedDoctor();

    public Prescription(Patient p, String date, Doctor doctor, String dosage, String frequency, String medicationName) {
        super(p);
        this.date = date;
        this.doctor = doctor;
        this.dosage = dosage;
        this.frequency = frequency;
        this.medicationName = medicationName;
    }

    public void getInfo(){
        System.out.println("[Prescription] : " + medicationName + ", " + dosage + ", " + frequency + ", 처방일: " + date + ", 의사: " +doctor.getName());
    }
}
