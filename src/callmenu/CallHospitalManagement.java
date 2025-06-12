package callmenu;

import enums.HospitalManagementEnum;
import hospital.HospitalManagement;

import java.util.*;

public class CallHospitalManagement {
    public static void callHospitalManagement(Scanner s, HospitalManagement hm) {
        while(true) {
            System.out.println("==========Hospital Management==========");
            for (HospitalManagementEnum e : HospitalManagementEnum.values()) {
                System.out.println(" " + e.getCode() + ". " + e.getMsg());
            }
            int chk;
            System.out.println();
            System.out.print("Input: ");
            chk = s.nextInt();
            switch (chk) {
                case 1:
                    CallAdd.add(s, hm);
                    break;

                case 2:
                    CallRemove.remove(s, hm);
                    break;

                case 3:
                    CallSet.set(s, hm);
                    break;

                case 4:
                    CallInformation.callInformation(s, hm);
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
