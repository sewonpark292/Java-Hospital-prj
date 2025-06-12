package callmenu;

import hospital.HospitalManagement;
import record.RecordsManagement;

import java.util.Scanner;

public class CallRecordsInfo {
    public static void info(Scanner s, RecordsManagement rm, HospitalManagement hm) {
        int key = 1;
        while(true) {
            hm.allPatientInfo();
            System.out.print("특정 환자 ID 입력(0 입력시 종료): ");
            key = s.nextInt();
            if(key == 0) {
                break;
            }

            System.out.println("ID: [" + key + "] 환자의 정보 출력");
            rm.recordInfo(key);
        }
    }
}
