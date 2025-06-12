package callmenu;

import enums.RecordsManagementEnum;
import hospital.HospitalManagement;
import record.RecordsManagement;

import java.util.Scanner;

public class CallRecordsManagement {
    public static void callRecordsManagement(Scanner s, RecordsManagement rm, HospitalManagement hm) {
        while(true) {
            System.out.println("==========Records Management==========");
            for(RecordsManagementEnum e : RecordsManagementEnum.values()) {
                System.out.println(" " + e.getCode() + ". " + e.getMsg());
            }
            int opt;
            System.out.println();
            System.out.print("Input: ");
            opt = s.nextInt();
            switch(opt) {
                case 1:
                    CallRecordAdd.add(s, rm, hm);
                    break;

                case 2:
                    CallRecordRemove.remove(s, rm, hm);
                    break;

                case 3:
                    CallRecordSet.set(s, rm, hm);
                    break;

                case 4:
                    CallRecordsInfo.info(s, rm, hm);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("잘못된 입력입니다 .다시 입력해주세요");
                    break;
            }
        }
    }
}
