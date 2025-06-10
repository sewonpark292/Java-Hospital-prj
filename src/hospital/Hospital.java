package hospital;

public class Hospital {
    private int hospitalID;
    private String hospitalName;
    private String hospitalAddress;
    private String hospitalPhone;

    public Hospital(int hospitalID, String hospitalName, String hospitalAddress, String hospitalPhone){
        this.hospitalID=hospitalID;
        this.hospitalName=hospitalName;
        this.hospitalAddress=hospitalAddress;
        this.hospitalPhone=hospitalPhone;
    }

    public Hospital() {}

    public String getHospitalPhone() {
        return hospitalPhone;
    }
    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone;
    }
    public String getHospitalAddress() {
        return hospitalAddress;
    }
    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }
    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public int getHospitalID() {
        return hospitalID;
    }
    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }
}
