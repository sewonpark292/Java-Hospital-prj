package main;

import enums.DeptName;
import enums.Gender;
import enums.Part;
import hospital.Hospital;
import hospital.HospitalManagement;
import outsorcing.Employee;
import outsorcing.OutSorcing;
import person.Doctor;
import person.Nurse;
import person.Patient;
import record.*;
import record.Record;

import java.io.*;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(1566, "금오 병원", "금오대로 446", "054-421-4456");
        HospitalManagement hm = new HospitalManagement();

        Doctor d1 = new Doctor("Dr. Kim", "010-1111-1111", "800101", Gender.male, 45, DeptName.PS);
        Doctor d2 = new Doctor("Dr. Lee", "010-1111-2222", "820202", Gender.female, 43, DeptName.PS);
        Doctor d3 = new Doctor("Dr. Park", "010-1111-3333", "850303", Gender.male, 40, DeptName.PS);
        Doctor d4 = new Doctor("Dr. Choi", "010-1111-4444", "870404", Gender.female, 38, DeptName.PS);
        Doctor d5 = new Doctor("Dr. Ahn", "010-3333-1111", "810101", Gender.male, 48, DeptName.OS);
        Doctor d6 = new Doctor("Dr. Jang", "010-3333-2222", "820505", Gender.female, 44, DeptName.OS);
        Doctor d7 = new Doctor("Dr. Yoon", "010-3333-3333", "830606", Gender.male, 41, DeptName.OS);
        Doctor d8 = new Doctor("Dr. Seo", "010-3333-4444", "840707", Gender.female, 39, DeptName.OS);
        Doctor d9 = new Doctor("Dr. Hwang", "010-5555-1111", "790101", Gender.female, 50, DeptName.OB);
        Doctor d10 = new Doctor("Dr. Min", "010-5555-2222", "800202", Gender.female, 48, DeptName.OB);
        Doctor d11 = new Doctor("Dr. Ryu", "010-5555-3333", "810303", Gender.male, 45, DeptName.OB);
        Doctor d12 = new Doctor("Dr. Baek", "010-5555-4444", "820404", Gender.female, 42, DeptName.OB);
        Doctor d13 = new Doctor("Dr. Im", "010-7777-1111", "850101", Gender.male, 40, DeptName.DER);
        Doctor d14 = new Doctor("Dr. Joo", "010-7777-2222", "860202", Gender.female, 38, DeptName.DER);
        Doctor d15 = new Doctor("Dr. Han", "010-7777-3333", "870303", Gender.female, 36, DeptName.DER);
        Doctor d16 = new Doctor("Dr. Yoo", "010-7777-4444", "880404", Gender.male, 35, DeptName.DER);

        Nurse n1 = new Nurse("Nurse A", "010-2222-1111", "900101", Gender.female, 30, DeptName.PS);
        Nurse n2 = new Nurse("Nurse B", "010-2222-2222", "910202", Gender.female, 29, DeptName.PS);
        Nurse n3 = new Nurse("Nurse C", "010-2222-3333", "920303", Gender.female, 28, DeptName.PS);
        Nurse n4 = new Nurse("Nurse D", "010-2222-4444", "930404", Gender.female, 27, DeptName.PS);
        Nurse n5 = new Nurse("Nurse E", "010-4444-1111", "910101", Gender.female, 30, DeptName.OS);
        Nurse n6 = new Nurse("Nurse F", "010-4444-2222", "920202", Gender.female, 29, DeptName.OS);
        Nurse n7 = new Nurse("Nurse G", "010-4444-3333", "930303", Gender.female, 28, DeptName.OS);
        Nurse n8 = new Nurse("Nurse H", "010-4444-4444", "940404", Gender.female, 27, DeptName.OS);
        Nurse n9 = new Nurse("Nurse I", "010-6666-1111", "900101", Gender.female, 30, DeptName.OB);
        Nurse n10 = new Nurse("Nurse J", "010-6666-2222", "910202", Gender.female, 29, DeptName.OB);
        Nurse n11 = new Nurse("Nurse K", "010-6666-3333", "920303", Gender.female, 28, DeptName.OB);
        Nurse n12 = new Nurse("Nurse L", "010-6666-4444", "930404", Gender.female, 27, DeptName.OB);
        Nurse n13 = new Nurse("Nurse M", "010-8888-1111", "910101", Gender.female, 30, DeptName.DER);
        Nurse n14 = new Nurse("Nurse N", "010-8888-2222", "920202", Gender.female, 29, DeptName.DER);
        Nurse n15 = new Nurse("Nurse O", "010-8888-3333", "930303", Gender.female, 28, DeptName.DER);
        Nurse n16 = new Nurse("Nurse P", "010-8888-4444", "940404", Gender.female, 27, DeptName.DER);

        hm.addDoctor(d1);
        hm.addDoctor(d2);
        hm.addDoctor(d3);
        hm.addDoctor(d4);
        hm.addDoctor(d5);
        hm.addDoctor(d6);
        hm.addDoctor(d7);
        hm.addDoctor(d8);
        hm.addDoctor(d9);
        hm.addDoctor(d10);
        hm.addDoctor(d11);
        hm.addDoctor(d12);
        hm.addDoctor(d13);
        hm.addDoctor(d14);
        hm.addDoctor(d15);
        hm.addDoctor(d16);

        hm.removeDoctor(d9);
        hm.removeDoctor(d10);

        hm.setDoctor(10, new Doctor("박세원", "010010010", "010731", Gender.male, 25, DeptName.DER));

        Doctor newD = new Doctor("주지훈", "01044444444", "771111", Gender.female, 50, DeptName.PS);
        hm.setDoctor(d15, newD);

        try {
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream("doctors.txt"));
            while(true) {
               System.out.println(ois.readObject().toString());
            }
        } catch(EOFException e){
            System.out.println("더 이상 객체가 없습니다. ");
        } catch(IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        hm.addNurse(n1);
        hm.addNurse(n2);
        hm.addNurse(n3);
        hm.addNurse(n4);
        hm.addNurse(n5);
        hm.addNurse(n6);
        hm.addNurse(n7);
        hm.removeNurse(n2);
        Nurse nurse=new Nurse("", ", ", ",",Gender.female, 44,DeptName.DER);
        hm.setNurse(4, nurse);
        hm.setNurse(n7, nurse);
        hm.addNurse(n8);
        hm.addNurse(n9);
        hm.addNurse(n10);
        hm.addNurse(n11);
        hm.addNurse(n12);
        hm.addNurse(n13);
        hm.addNurse(n14);
        hm.addNurse(n15);
        ObjectInputStream nois=null;
        try {
            nois = new ObjectInputStream(new FileInputStream("nurses.txt"));
            while (true) {
                System.out.println(nois.readObject().toString());
            }
        } catch(EOFException e) {
            System.out.println("더 이상 객체가 없습니다.");
        } catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        } finally {
            try {
                if(nois!=null) nois.close();
            } catch(IOException e ){
                System.out.println(e);
            }
        }

    }
}
