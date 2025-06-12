package callmenu;

import enums.InfoEnum;
import hospital.HospitalManagement;

import java.util.Scanner;

public class CallInformation {
    public static void callInformation(Scanner s, HospitalManagement hm) {
        while (true) {
            System.out.println("==========Information of Object==========");
            for (InfoEnum e : InfoEnum.values()) {
                System.out.println(" " + e.getCode() + ". " + e.getMsg());
            }
            int chk;
            System.out.println();
            System.out.print("Input: ");
            chk = s.nextInt();
            switch (chk) {
                case 1:
                    System.out.println("==========");
                    hm.allDoctorInfo();
                    break;

                case 2:
                    System.out.println("==========");
                    hm.allNurseInfo();
                    break;

                case 3:
                    System.out.println("==========");
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
