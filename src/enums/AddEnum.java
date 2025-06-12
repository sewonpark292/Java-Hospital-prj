package enums;

public enum AddEnum {
    add_doctor(1, "의사 추가"),
    add_nurse(2, "간호사 추가"),
    add_patient(3, "환자 추가"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;
    AddEnum(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }
    public int getCode() {
        return code;
    }
}
