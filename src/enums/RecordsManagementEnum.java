package enums;

public enum RecordsManagementEnum {
    add(1, "특정 환자 기록 추가"),
    remove(2, "특정 환자 기록 삭제"),
    set(3, "특정 환자 기록 수정"),
    info(4, "특정 환자 기록 정보 출력"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;

    RecordsManagementEnum(int code, String msg) {
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
