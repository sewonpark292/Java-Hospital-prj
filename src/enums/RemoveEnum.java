package enums;

public enum RemoveEnum {
    remove_doctor(1, "의사 삭제"),
    remove_nurse(2, "간호사 삭제"),
    remove_patient(3, "환자 삭제"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;

    RemoveEnum(int code, String msg) {
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
