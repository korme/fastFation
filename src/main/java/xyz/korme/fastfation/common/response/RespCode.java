package xyz.korme.fastfation.common.response;

public enum RespCode {
    SUCCESS(0, "请求成功"),
    WRONG(1,"请求错误"),
    ERROR(2,"数据库错误"),
    WARN(3, "网络异常，请稍后重试");


    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}