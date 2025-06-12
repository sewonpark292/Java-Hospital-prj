package callmenu;

import hospital.HospitalManagement;
import person.Patient;
import record.Record;
import record.RecordsManagement;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CallRecordRemove {
    public static void remove(Scanner s, RecordsManagement rm, HospitalManagement hm) {
        int key=1;
        while(true) {
            System.out.println("==========");
            hm.allPatientInfo();
            System.out.print("기록을 삭제할 특정 환자 ID 입력(0 입력시 종료): ");
            key = s.nextInt();
            if(key == 0){
                break;
            }
            System.out.println("==========");

            rm.recordInfo(key);
            System.out.print("삭제할 기록의 index 입력: ");
            int idx = s.nextInt(); //특정 idx값 입력 받음

            Patient p = hm.findPatientById(key); //아이디로 환자 찾기 메서드 구현
            Map<Integer, List<Record>> patientRec = rm.getMap();

            rm.removeRecordByIdx(key, idx);
            rm.recordInfo(key);
        }
    }
}
