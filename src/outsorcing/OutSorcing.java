package outsorcing;
import hospital.Hospital;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class OutSorcing extends Hospital {
    private String partnerCompany;
    private String companyName;
    private String location;

    public OutSorcing(String partnerCompany, String companyName, String location){
        this.partnerCompany=partnerCompany;
        this.companyName=companyName;
        this.location=location;
    }

    public String getPartnerCompany() {
        return partnerCompany;
    }
    public String getCompanyName(){
        return companyName;
    }

    public void outsorcingInfo(){
        System.out.printf("Partner : %s, CompanyName : %s, Location : %s \n"
        , partnerCompany, companyName, location);
    }
    public void employInfo(Employee e){
        e.employInfo();
    }
    public void allEmploysInfo(){
        for(Employee e : Employee.getEmployList()){
            e.employInfo();
        }
    }
    public void saveEmployeeListToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.txt"));
            List<Employee> elist = Employee.getEmployList();
            for(Employee e : elist) {
                oos.writeObject(e);
            }
            oos.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
    public void addEmployee(Employee e){
        Employee.getEmployList().add(e);
    }
    public void removeEmployee(Employee e){
        Employee.getEmployList().remove(e);
    }
    public void setEmployee(int index, Employee e){
        Employee.getEmployList().set(index, e);
    }
    public void setEmployee(Employee del, Employee employee) {
        int key = del.getEmployeeID();
        List<Employee> elist = Employee.getEmployList();
        int idx=0;
        for(Employee e : elist) {
            if(key == e.getEmployeeID()) {
                elist.set(idx, employee);
                saveEmployeeListToFile();
            }
            idx++;
        }
    }
}
