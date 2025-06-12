package enums;

public enum RecordsEnum {
    diagnosis(1, "Diagnosis"),
    prescription(2, "Prescription"),
    treatment(3, "Treatment"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;

    RecordsEnum(int code, String msg) {
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
