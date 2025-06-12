package person;
import enums.DeptName;
import enums.Gender;

import java.io.Serializable;
import java.util.*;

public class Nurse extends Person implements Serializable {
    private static int nurseIDCounter=2000;
    private static ArrayList<Nurse> nurseList=new ArrayList<>();
    private int nurseID=2000;
    private DeptName dept;

    public Nurse(String name, String phone, String birthdate, Gender gender, int age, DeptName dept) {
        super(name, phone, birthdate, gender, age);
        this.nurseID=nurseIDCounter++;
        this.dept=dept;
    }

    public int getNurseID(){return nurseID;}
    public DeptName getDept(){return dept;}
    public static ArrayList<Nurse> getNurseList(){
        return nurseList;
    }

    public static Nurse findAssignNurse(DeptName deptn){ //진료과에 맞게 배정
        ArrayList<Nurse> deptNurse = new ArrayList<>();
        Random rand=new Random();
        for(Nurse n : nurseList){
            if(n.getDept().equals(deptn)){ //getDept()를 써야 함.
                deptNurse.add(n); //진료과에 맞게 간호사 추가
            }
        }
        return deptNurse.get(rand.nextInt(deptNurse.size()));
    }
    public void nurseInfo(){
        System.out.println(", Nurse ID : "+nurseID+", Dept : "+dept);
    }
    @Override
    public String toString() { //println(doctor)시에 toString()이 오버라이딩 되어 있어야 함
        return "Nurse{" +
                "nurseID=" + getNurseID() +
                ", name='" + getName() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dept=" + getDept() +
                '}';
    }
}
