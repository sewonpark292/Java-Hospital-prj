package enums;

public enum HospitalManagementEnum {
    add(1, "추가"),
    remove(2, "삭제"),
    set(3, "수정"),
    info(4, "정보"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;

    HospitalManagementEnum(int code, String msg) {
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
