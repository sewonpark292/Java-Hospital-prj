package outsorcing;
import hospital.Hospital;

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
    public void addEmployee(Employee e){
        Employee.getEmployList().add(e);
    }
    public void removeEmployee(Employee e){
        Employee.getEmployList().remove(e);
    }
    public void setEmployee(int index, Employee e){
        Employee.getEmployList().set(index, e);
    }
}
