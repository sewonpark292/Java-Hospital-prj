package record;

import person.Nurse;
import person.Patient;

public class Treatment extends Record{
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
        System.out.println("[Treatment] : " + treatments + ", 날짜: " + date + ", 메모: " + notes + ", 간호사: " + nurse.getName());
    }
}
