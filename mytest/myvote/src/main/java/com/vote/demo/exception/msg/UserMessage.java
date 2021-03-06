package com.vote.demo.exception.msg;

public enum UserMessage {
    USER_CANNOT_BE_NULL(1000,"user不能为空"),
    USER_IS_NULL(1001,"用户不存在"),
    ;

    private int code;
    private String msg;

    UserMessage(int code, String msg) {
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
