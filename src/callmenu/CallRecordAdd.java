package callmenu;

import enums.RecordsEnum;
import hospital.HospitalManagement;
import person.Doctor;
import person.Nurse;
import person.Patient;
import record.*;
import record.Record;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CallRecordAdd {
    public static void add(Scanner s, RecordsManagement rm, HospitalManagement hm) {
        int key=1;
        while(true) {
            System.out.println("====================");
            hm.allPatientInfo();
            System.out.print("기록을 추가할 특정 환자 ID 입력(0 입력시 종료): ");
            key = s.nextInt();
            if(key == 0) {
                break;
            }
            Patient p = hm.findPatientById(key); //아이디로 환자 찾기 메서드 구현
            Map<Integer, List<Record>> patientRec = rm.getMap();
            System.out.println("==========Record Type==========");
            for (RecordsEnum e : RecordsEnum.values()) {
                System.out.println(" " + e.getCode() + ". " + e.getMsg());
            }
            System.out.println();
            System.out.print("Input: ");
            int opt = s.nextInt();
            s.nextLine();
            switch (opt) {
                case 1:
                    System.out.print("진단명: ");
                    String diagnosisName = s.nextLine();
                    System.out.print("작성일자: ");
                    String date = s.nextLine();
                    System.out.print("메모: ");
                    String notes = s.nextLine();
                    Doctor d = p.getAssignedDoctor();
                    Diagnosis diag = new Diagnosis(p, d, diagnosisName, date, notes);
                    rm.putRecord(key, diag);
                    System.out.println("==========");
                    rm.recordInfo(key);
                    break;

                case 2:
                    System.out.print("처방약: ");
                    String medicationName = s.nextLine();
                    System.out.print("투약량: ");
                    String dosage = s.nextLine();
                    System.out.print("투약횟수: ");
                    String frequency = s.nextLine();
                    System.out.print("처방일자: ");
                    String date2 = s.nextLine();
                    Doctor d2 = p.getAssignedDoctor();
                    Prescription pres = new Prescription(p, date2, d2, dosage, frequency, medicationName);
                    rm.putRecord(key, pres);
                    System.out.println("==========");
                    rm.recordInfo(key);
                    break;

                case 3:
                    System.out.print("처치: ");
                    String treatments = s.nextLine();
                    System.out.print("작성일자: ");
                    String date3 = s.nextLine();
                    System.out.print("메모: ");
                    String notes3 = s.nextLine();
                    Nurse n3 = p.getAssignedNurse();
                    Treatment treat = new Treatment(p, date3, notes3, n3, treatments);
                    rm.putRecord(key, treat);
                    System.out.println("==========");
                    rm.recordInfo(key);
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
