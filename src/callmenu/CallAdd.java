package callmenu;

import enums.AddEnum;
import enums.DeptName;
import enums.Gender;
import hospital.HospitalManagement;
import person.Doctor;
import person.Nurse;
import person.Patient;

import java.util.Scanner;

public class CallAdd {
    public static void add(Scanner s, HospitalManagement hm) {
        while(true) {
            System.out.println("==========add object==========");
            for (AddEnum e : AddEnum.values()) {
                System.out.println(" " + e.getCode() + ". " + e.getMsg());
            }
            int chk;
            System.out.println();
            System.out.print("Input: ");
            chk = s.nextInt();
            String name, phone, birthdate, gender, dept;
            int age;
            switch (chk) {
                case 1:
                    //Doctor d3 = new Doctor("Dr. Park", "010-1111-3333", "850303", Gender.male, 40, DeptName.PS);
                    System.out.print("이름, 전화번호, 생년월일, 성별(male,female), 나이, 진료과(OS,PS,OB,DER) 순 입력: ");

                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    dept = s.next();
                    Doctor d = new Doctor(name, phone, birthdate, Gender.valueOf(gender), age, DeptName.valueOf(dept));
                    hm.addDoctor(d);
                    hm.doctorInfo(d);
                    break;

                case 2:
                    //Doctor d3 = new Doctor("Dr. Park", "010-1111-3333", "850303", Gender.male, 40, DeptName.PS);
                    System.out.print("이름, 전화번호, 생년월일, 성별(male,female), 나이, 진료과(OS,PS,OB,DER) 순 입력: ");

                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    dept = s.next();
                    Nurse n = new Nurse(name, phone, birthdate, Gender.valueOf(gender), age, DeptName.valueOf(dept));
                    hm.addNurse(n);
                    hm.nurseInfo(n);
                    break;

                case 3:
                    //Patient p1 = new Patient("Kim", "010-1111-0001", "2000-01-01", Gender.male, 25, DeptName.OB);
                    System.out.print("이름, 전화번호, 생년월일, 성별(male,female), 나이, 진료과(OS,PS,OB,DER) 순 입력: ");

                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    dept = s.next();
                    Patient p = new Patient(name, phone, birthdate, Gender.valueOf(gender), age, DeptName.valueOf(dept));
                    hm.addPatient(p);
                    hm.patientInfo(p);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                    break;
            }
        }
    }
}
