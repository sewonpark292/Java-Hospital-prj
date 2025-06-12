package main;

import hospital.Hospital;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(1566, "금오 병원", "금오대로 446", "054-421-4456");
//        HospitalManagement hm = new HospitalManagement();
//        RecordsManagement rm=new RecordsManagement();
//
//        Doctor d3 = new Doctor("Dr. Park", "010-1111-3333", "850303", Gender.male, 40, DeptName.PS);
//        Doctor d4 = new Doctor("Dr. Choi", "010-1111-4444", "870404", Gender.female, 38, DeptName.PS);
//        Doctor d7 = new Doctor("Dr. Yoon", "010-3333-3333", "830606", Gender.male, 41, DeptName.OS);
//        Doctor d8 = new Doctor("Dr. Seo", "010-3333-4444", "840707", Gender.female, 39, DeptName.OS);
//        Doctor d11 = new Doctor("Dr. Ryu", "010-5555-3333", "810303", Gender.male, 45, DeptName.OB);
//        Doctor d12 = new Doctor("Dr. Baek", "010-5555-4444", "820404", Gender.female, 42, DeptName.OB);
//        Doctor d15 = new Doctor("Dr. Han", "010-7777-3333", "870303", Gender.female, 36, DeptName.DER);
//        Doctor d16 = new Doctor("Dr. Yoo", "010-7777-4444", "880404", Gender.male, 35, DeptName.DER);
//
//        Nurse n3 = new Nurse("Nurse C", "010-2222-3333", "920303", Gender.female, 28, DeptName.PS);
//        Nurse n4 = new Nurse("Nurse D", "010-2222-4444", "930404", Gender.female, 27, DeptName.PS);
//        Nurse n7 = new Nurse("Nurse G", "010-4444-3333", "930303", Gender.female, 28, DeptName.OS);
//        Nurse n8 = new Nurse("Nurse H", "010-4444-4444", "940404", Gender.female, 27, DeptName.OS);
//        Nurse n11 = new Nurse("Nurse K", "010-6666-3333", "920303", Gender.female, 28, DeptName.OB);
//        Nurse n12 = new Nurse("Nurse L", "010-6666-4444", "930404", Gender.female, 27, DeptName.OB);
//        Nurse n15 = new Nurse("Nurse O", "010-8888-3333", "930303", Gender.female, 28, DeptName.DER);
//        Nurse n16 = new Nurse("Nurse P", "010-8888-4444", "940404", Gender.female, 27, DeptName.DER);
//
//        hm.addDoctor(d3);
//        hm.addDoctor(d4);
//        hm.addDoctor(d7);
//        hm.addDoctor(d8);
//        hm.addDoctor(d11);
//        hm.addDoctor(d12);
//        hm.addDoctor(d15);
//        hm.addDoctor(d16);
//
//        hm.addNurse(n3);
//        hm.addNurse(n4);
//        hm.addNurse(n7);
//        hm.addNurse(n8);
//        hm.addNurse(n11);
//        hm.addNurse(n12);
//        hm.addNurse(n15);
//        hm.addNurse(n16);
//
//        Patient p1 = new Patient("Kim", "010-1111-0001", "2000-01-01", Gender.male, 25, DeptName.OB);
//        Patient p2 = new Patient("Lee", "010-1111-0002", "2000-02-02", Gender.female, 24, DeptName.OS);
//        Patient p3 = new Patient("Park", "010-1111-0003", "2000-03-03", Gender.male, 23, DeptName.DER);
//        Patient p4 = new Patient("Choi", "010-1111-0004", "2000-04-04", Gender.female, 22, DeptName.PS);
//
//        Record r1_1 = new Diagnosis(p1, d3, "고혈압", "2025-06-01", "혈압이 높음");
//        Record r1_2 = new Prescription(p2, "2025-06-01", d3, "10mg", "1일 1회", "혈압약");
//        Record r1_3 = new Treatment(p1, "2025-06-01", "정기 혈압 측정", n3, "혈압 측정");
//        Record r1_4 = new Diagnosis(p2, d3, "부정맥", "2025-06-02", "심장 박동 불규칙");
//        Record r1_5 = new Prescription(p1, "2025-06-02", d3, "5mg", "1일 2회", "부정맥약");
//        Record r1_6 = new Treatment(p2, "2025-06-02", "심전도 검사", n3, "ECG 검사");
//        Record r1_7 = new Diagnosis(p1, d3, "고지혈증", "2025-06-03", "콜레스테롤 높음");
//        Record r1_8 = new Prescription(p2, "2025-06-03", d3, "20mg", "1일 1회", "콜레스테롤약");
//        Record r1_9 = new Treatment(p1, "2025-06-03", "채혈", n3, "혈액 검사");
//        Record r1_10 = new Treatment(p2, "2025-06-04", "식이상담", n3, "영양 상담");
//
//        hm.addPatient(p1);
//        hm.addPatient(p2);
//        hm.addPatient(p3);
//        hm.addPatient(p4);
//
//        rm.putRecord(p1.getPatientID(), r1_1);
//        rm.putRecord(p2.getPatientID(), r1_2);
//        rm.putRecord(p1.getPatientID(), r1_3);
//        rm.putRecord(p2.getPatientID(), r1_4);
//        rm.putRecord(p1.getPatientID(), r1_5);
//        rm.putRecord(p2.getPatientID(), r1_6);
//        rm.putRecord(p1.getPatientID(), r1_7);
//        rm.putRecord(p2.getPatientID(), r1_8);
//        rm.putRecord(p1.getPatientID(), r1_9);
//        rm.putRecord(p2.getPatientID(), r1_10);

        Scanner s = new Scanner(System.in);
        Menu m = new Menu();
        m.mainMenu(s);
    }
}
