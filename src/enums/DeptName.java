package enums;

public enum DeptName {
    OS("정형외과", 101),
    PS("성형외과", 102),
    OB("산부인과", 103),
    DER("피부과", 104);

    private final String deptName;
    private final int deptCode;

    DeptName(String deptKname, int deptCode){
        this.deptCode=deptCode;
        this.deptName=deptKname;
    }
    public String getDeptKname(){
        return deptName;
    }
    public int getDeptCode(){
        return deptCode;
    }
}
