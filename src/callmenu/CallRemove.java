package callmenu;

import enums.RemoveEnum;
import hospital.HospitalManagement;
import person.Doctor;
import person.Nurse;
import person.Patient;

import java.util.List;
import java.util.Scanner;

public class CallRemove {
    public static void remove(Scanner s, HospitalManagement hm) {
        while(true) {
            System.out.println("==========remove object==========");
            for (RemoveEnum e : RemoveEnum.values()) {
                System.out.println(" " + e.getCode() + ". " + e.getMsg());
            }
            int chk;
            System.out.println();
            System.out.print("Input: ");
            chk = s.nextInt();

            switch (chk) {
                case 1:
                    System.out.println("삭제할 의사의 id 입력 :");
                    hm.allDoctorInfo();
                    int doctor_key = s.nextInt();
                    List<Doctor> dlist = Doctor.getDoctorList();
                    Doctor ddel = null;
                    //for-each 문으로 삭제하니까 iterator 사용 권장 > 삭제할 의사 객체 미리 선언
                    for (Doctor d : dlist) {
                        if (doctor_key == d.getDoctorID()) {
                            ddel = d; //의사 객체 대입
                            break;
                        }
                    }
                    hm.removeDoctor(ddel);
                    hm.allDoctorInfo();
                    break;

                case 2:
                    hm.allNurseInfo();
                    System.out.println("삭제할 간호사의 id 입력 : ");
                    int nurse_key = s.nextInt();
                    List<Nurse> nlist = Nurse.getNurseList();
                    Nurse ndel = null;
                    for (Nurse n : nlist) {
                        if (nurse_key == n.getNurseID()) {
                            ndel = n;
                            break;
                        }
                    }
                    hm.removeNurse(ndel);
                    hm.allNurseInfo();
                    break;

                case 3:
                    hm.allPatientInfo();
                    System.out.println("삭제할 환자의 id 입력 : ");
                    int patient_key = s.nextInt();
                    List<Patient> plist = Patient.getPatientList();
                    Patient pdel = null;
                    for (Patient p : plist) {
                        if (patient_key == p.getPatientID()) {
                            pdel = p;
                        }
                    }
                    hm.removePatient(pdel);
                    hm.allPatientInfo();
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
