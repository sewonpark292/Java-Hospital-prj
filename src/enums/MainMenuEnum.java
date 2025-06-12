package enums;

public enum MainMenuEnum {
    management_hospital(1, "병원 관리"),
    management_record(2, "기록 관리"),
    management_outsourcing(3, "용역 관리"),
    exit(0, "종료");

    final int code;
    final String msg;

    MainMenuEnum(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
