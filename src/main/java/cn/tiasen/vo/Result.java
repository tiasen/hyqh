package cn.tiasen.vo;

import java.io.Serializable;

public class Result implements Serializable {
    private String message;
    private int code;
    private Object data;

    public static Result success(Object data){
        return new Result("ok",200,data);
    }

    public static Result error(String msg){
        return new Result(msg,400,null);
    }

    public Result(String message, int code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
