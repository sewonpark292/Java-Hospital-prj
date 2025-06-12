package callmenu;

import enums.DeptName;
import enums.Gender;
import enums.SetEnum;
import hospital.HospitalManagement;
import person.Doctor;
import person.Nurse;
import person.Patient;

import java.util.List;
import java.util.Scanner;

public class CallSet {
    public static void set(Scanner s, HospitalManagement hm) {
        while (true) {
            System.out.println("==========set Object==========");
            for (SetEnum e : SetEnum.values()) {
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
                    hm.allDoctorInfo();
                    System.out.println("수정할 의사의 id 입력 : ");
                    int doctor_key = s.nextInt();
                    System.out.println("수정할 의사의 정보 입력 : 이름, 전화번호, 생년월일, 성별(male,female), 나이, 진료과(OS,OB,PS,DER) 순으로 입력");
                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    dept = s.next();
                    List<Doctor> dlist = Doctor.getDoctorList();
                    Doctor dset = new Doctor(name, phone, birthdate, Gender.valueOf(gender), age, DeptName.valueOf(dept));
                    Doctor ddel = null;
                    for(Doctor d : dlist) {
                        if(doctor_key == d.getDoctorID()) {
                            ddel = d;
                            break;
                        }
                    }
                    if(ddel != null) {
                        hm.setDoctor(ddel, dset);
                        hm.doctorInfo(dset);
                    }
                    break;

                case 2:
                    hm.allNurseInfo();
                    System.out.println("수정할 간호사의 id 입력 : ");
                    int nurse_key = s.nextInt();
                    System.out.println("수정할 간호사의 정보 입력 : 이름, 전화번호, 생년월일, 성별(male,female), 나이, 진료과(OS,OB,PS,DER) 순으로 입력");
                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    dept = s.next();
                    List<Nurse> nlist = Nurse.getNurseList();
                    Nurse nset = new Nurse(name, phone, birthdate, Gender.valueOf(gender), age, DeptName.valueOf(dept));
                    Nurse ndel = null;
                    for(Nurse n : nlist) {
                        if(nurse_key == n.getNurseID()) {
                            ndel = n;
                            break;
                        }
                    }
                    if(ndel != null) {
                        hm.setNurse(ndel, nset);
                        hm.nurseInfo(nset);
                    }
                    break;

                case 3:
                    hm.allPatientInfo();
                    System.out.println("수정할 환자의 id 입력 : ");
                    int patient_key = s.nextInt();
                    System.out.println("수정할 환자의 정보 입력 : 이름, 전화번호, 생년월일, 성별(male,female), 나이, 진료과(OS,OB,PS,DER) 순으로 입력");
                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    dept = s.next();
                    List<Patient> plist = Patient.getPatientList();
                    Patient pset = new Patient(name, phone, birthdate, Gender.valueOf(gender), age, DeptName.valueOf(dept));
                    Patient pdel = null;
                    for(Patient p : plist) {
                        if (patient_key == p.getPatientID()) {
                            pdel = p;
                            break;
                        }
                    }
                    if(pdel != null) {
                        hm.setPatient(pdel, pset);
                        hm.patientInfo(pset);
                    }
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
