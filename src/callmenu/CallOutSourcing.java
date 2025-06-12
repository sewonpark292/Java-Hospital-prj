package callmenu;

import enums.Gender;
import enums.OutSourcingEnum;
import enums.Part;
import outsourcing.Employee;
import outsourcing.OutSourcing;

import java.util.Scanner;

public class CallOutSourcing {
    public static void callOutSourcingManagement(Scanner s, OutSourcing os) {
        while(true) {
            System.out.println("==========Out Sourcing==========");
            for(OutSourcingEnum e : OutSourcingEnum.values()) {
                System.out.println(" " + e.getCode() + ". " + e.getMsg());
            }
            System.out.println();
            System.out.print("Input: ");
            int chk = s.nextInt();
            s.nextLine();
            String name;
            String phone;
            String birthdate;
            String gender;
            int age;
            String part;
            int key;

            switch (chk) {
                case 1:
                    os.outsorcingInfo();
                    break;

                case 2:
                    System.out.println("추가할 고용인 정보 입력: 이름, 전화번호, 생년월일, 성별(male,female), 나이, 파트(financing,cleaning,facilityManagement) 순으로 입력");
                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    part = s.next();
                    Employee e = new Employee(name, phone, birthdate, Gender.valueOf(gender), age, Part.valueOf(part));
                    os.addEmployee(e);
                    os.allEmploysInfo();
                    break;

                case 3:
                    os.allEmploysInfo();
                    System.out.print("삭제할 고용인의 ID 입력: ");
                    key = s.nextInt();
                    os.removeEmployee(os.findEmployeeById(key));
                    os.allEmploysInfo();
                    break;

                case 4:
                    System.out.print("수정할 고용인의 ID 입력: ");
                    key = s.nextInt();
                    Employee del = os.findEmployeeById(key);

                    System.out.println();
                    System.out.print("수정할 고용인의 정보 입력: 이름, 전화번호, 생년월일, 성별(male,female), 나이, 파트(financing,cleaning,facilityManagement)");
                    name = s.next();
                    phone = s.next();
                    birthdate = s.next();
                    gender = s.next();
                    age = s.nextInt();
                    part = s.next();
                    Employee ne = new Employee(name, phone, birthdate, Gender.valueOf(gender), age, Part.valueOf(part));
                    os.setEmployee(del, ne);
                    os.allEmploysInfo();
                    break;

                case 5:
                    System.out.println("==========");
                    os.allEmploysInfo();
                    break;

                case 0:
                    return;

                default:
                    break;
            }
        }
    }
}
