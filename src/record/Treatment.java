package record;

import person.Nurse;
import person.Patient;

import java.io.Serializable;

public class Treatment extends Record implements Serializable {
    private String treatments;
    private String date;
    private Nurse nurse;
    private String notes;

    public Treatment(Patient p, String date, String notes, Nurse nurse, String treatments) {
        super(p);
        this.date = date;
        this.notes = notes;
        this.nurse = nurse;
        this.treatments = treatments;
    }

    public void getInfo(){
        System.out.println("[Treatment] : " + treatments + ", Date : " + date + ", memo : " + notes + ", Nurse : " + nurse.getName());
    }
    @Override
    public String toString() {
        return "P.Name : " + p.getName() +  " [Treatment : "+ treatments + ", Date : " + date + ", memo : " + notes + ", Nurse : " + nurse.getName() + "]";
    }
}
