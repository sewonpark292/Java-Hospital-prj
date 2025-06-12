package hospital;

import person.Doctor;
import person.Nurse;
import person.Patient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class HospitalManagement extends Hospital {
    public void allDoctorInfo() {
        for (Doctor d : Doctor.getDoctorList()) {
            d.getInfo();
            d.doctorInfo();
        }
    }
    public void doctorInfo(Doctor doctor) {
        doctor.getInfo();
        doctor.doctorInfo();
    }
    public void saveDoctorListToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("doctors.txt"));
            List<Doctor> dlist = Doctor.getDoctorList();
            for(Doctor d : dlist) {
                oos.writeObject(d);
            }
            oos.close();
        } catch(IOException e) {
            System.out.println(e);
        }

    }
    public void addDoctor(Doctor d){
        Doctor.getDoctorList().add(d);
        saveDoctorListToFile();
    }
    public void removeDoctor(Doctor d) {
        Doctor.getDoctorList().remove(d);
        saveDoctorListToFile();
    }
    public void setDoctor(int index, Doctor d) {
        Doctor.getDoctorList().set(index, d);
        saveDoctorListToFile();
    }
    public void setDoctor(Doctor d, Doctor newdoctor){
        int key=d.getDoctorID();
        List<Doctor> dlist = Doctor.getDoctorList();
        int idx=0;
        for(Doctor doctor : dlist){
            if(doctor.getDoctorID() == key){
                dlist.set(idx, newdoctor);
                saveDoctorListToFile();
            }
            idx++;
        }
    }

    public void allNurseInfo(){
        for(Nurse n : Nurse.getNurseList()){
            n.getInfo();
            n.nurseInfo();
        }
    }
    public void nurseInfo(Nurse n){
        n.getInfo();
        n.nurseInfo();
    }
    public void saveNurseListToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nurses.txt"));
            List<Nurse> nlist = Nurse.getNurseList();
            for( Nurse n : nlist ) {
                oos.writeObject(n);
            }
            oos.close();
        } catch(IOException e ){
            System.out.println(e);
        }
    }
    public void addNurse(Nurse n){
        Nurse.getNurseList().add(n);
        saveNurseListToFile();
    }
    public void removeNurse(Nurse n){
        Nurse.getNurseList().remove(n);
        saveNurseListToFile();
    }
    public void setNurse(int index, Nurse n){
        Nurse.getNurseList().set(index, n);
        saveNurseListToFile();
    }
    public void setNurse(Nurse del, Nurse newNurse){
        int key=del.getNurseID();
        List<Nurse> nlist = Nurse.getNurseList();
        int idx=0;
        for(Nurse nurse : nlist){
            if(key==nurse.getNurseID()){
                nlist.set(idx, newNurse);
                saveNurseListToFile();
            }
            idx++;
        }
    }

    public void patientInfo(Patient patient){
        patient.getInfo();
        System.out.print(patient.patientInfo());
    }
    public void allPatientInfo(){
        for(Patient p : Patient.getPatientList()){
            p.getInfo();
            System.out.print(p.patientInfo());
        }
    }
    public void savePatientListToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("patients.txt"));
            List<Patient> plist = Patient.getPatientList();
            for(Patient p : plist) {
                oos.writeObject(p);
            }
            oos.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    public void addPatient(Patient patient){
        Patient.getPatientList().add(patient);
        savePatientListToFile();
    }
    public void removePatient(Patient patient){
        Patient.getPatientList().remove(patient);
        savePatientListToFile();
    }
    public void setPatient(int index, Patient patient){
        Patient.getPatientList().set(index, patient);
        savePatientListToFile();
    }
    public void setPatient(Patient del, Patient newPatient){
        int key=del.getPatientID();
        List<Patient> plist = Patient.getPatientList();
        int idx=0;
        for(Patient patient : plist){
            if(key==patient.getPatientID()) {
                plist.set(idx, newPatient);
                savePatientListToFile();
            }
            idx++;
        }
    }
    public Patient findPatientById(int id) {
        List<Patient> plist = Patient.getPatientList();
        for(Patient p : plist) {
            if(id == p.getPatientID()) {
                return p;
            }
        }
        return null;
    }
}
