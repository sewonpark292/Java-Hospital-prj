package enums;

public enum InfoEnum {
    doctor_info(1, "의사 정보"),
    nurse_info(2, "간호사 정보"),
    patient_info(3, "환자 정보"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;

    InfoEnum(int code, String msg) {
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
