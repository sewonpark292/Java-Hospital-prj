package enums;

public enum OutSourcingEnum {
    os_info(1, "용역 업체 정보"),
    emp_add(2, "고용인 추가"),
    emp_remove(3, "고용인 삭제"),
    emp_set(4, "고용인 수정"),
    emp_info(5, "고용인 정보"),
    exit(0, "뒤로 가기");

    final int code;
    final String msg;

    OutSourcingEnum(int code, String msg) {
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