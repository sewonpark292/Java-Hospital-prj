package main;

import callmenu.CallHospitalManagement;
import callmenu.CallInformation;
import callmenu.CallOutSourcing;
import callmenu.CallRecordsManagement;
import enums.MainMenuEnum;
import hospital.Hospital;
import hospital.HospitalManagement;
import outsourcing.OutSourcing;
import record.RecordsManagement;

import java.util.Scanner;

public class Menu {

    public void mainMenu(Scanner s) {
        System.out.println("==========병원 정보 입력==========");
        System.out.print("병원명: ");
        String hospitalName = s.nextLine();
        System.out.print("병원 고유 ID: ");
        int hospitalID = s.nextInt();
        s.nextLine();
        System.out.print("병원 주소: ");
        String hospitalAddress = s.nextLine();
        System.out.print("병원 전화번호: ");
        String hospitalPhone = s.nextLine();
        Hospital hospital = new Hospital(hospitalID, hospitalName, hospitalAddress, hospitalPhone);

        RecordsManagement rm = new RecordsManagement();
        HospitalManagement hm = new HospitalManagement();

        System.out.println("==========계약 용역 업체 정보 입력==========");
        System.out.print("계약의 주체 병원명: ");
        String partnerCompany = s.nextLine();
        System.out.print("계약한 업체명: ");
        String companyName = s.nextLine();
        System.out.print("업체 위치: ");
        String location = s.nextLine();
        OutSourcing os = new OutSourcing(partnerCompany, companyName, location);
        while(true) {
            System.out.println("==========Main Menu==========");
            for (MainMenuEnum m : MainMenuEnum.values()) {
                System.out.println(" " + m.getCode() + ". " + m.getMsg());
            }
            int chk;
            System.out.println();
            System.out.print("Input: ");
            chk = s.nextInt();
            s.nextLine();

            switch (chk) {
                case 1:
                    CallHospitalManagement.callHospitalManagement(s, hm);
                    break;
                case 2:

                    CallRecordsManagement.callRecordsManagement(s, rm, hm);
                    break;
                case 3:
                    CallOutSourcing.callOutSourcingManagement(s, os);
                    break;
                case 4:
                    CallInformation.callInformation(s, hm);
                case 0:
                    return ;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
