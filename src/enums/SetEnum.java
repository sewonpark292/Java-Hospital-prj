package enums;

public enum SetEnum {
    set_doctor(1, "의사 수정"),
    set_nurse(2, "간호사 수정"),
    set_patient(3, "환자 수정"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;

    SetEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

