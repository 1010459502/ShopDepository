package com.shop.shopdepository.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.StringJoiner;

/**
 * 所有服务统一相应数据格式
 * @author zyj
 *
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {

    /**
     * 响应码
     */
    private  Integer code;
    /**
     * 响应消息
     */
    private String statusInfo;
    /**
     * 响应内容
     */
    private T data;

    /**
     * 受影响的行数
     * 数据条数
     */
    private int count;


    public Result(T data){
        this.data = data;
    }

    public Result(Integer code, String statusInfo){
        this.code = code;
        this.statusInfo = statusInfo;
    }

    public  Result(Integer code, String statusInfo, T data){
        this.code = code;
        this.statusInfo = statusInfo;
        this.data = data;
    }

    public Result(Integer code, int count, String statusInfo) {
        this.code = code;
        this.count = count;
        this.statusInfo = statusInfo;
    }

    public static <T> Result<T> success(){
        return new Result<>(ResultEnum.SUCCESS.getCode(),
                ResultEnum.SUCCESS.getMessage());
    }

    public static <T> Result<T> success(T data){
        return new Result<>(ResultEnum.SUCCESS.getCode(),
                ResultEnum.SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> fail(){
        return new Result<>(ResultEnum.FAILURE.getCode(),
                ResultEnum.FAILURE.getMessage());
    }

    public static <T> Result<T> fail(Integer code,String message){
        return new Result<>(code,message);
    }

    public static <T> Result<T> error(){
        return new Result<>(ResultEnum.ERROR.getCode(),
                ResultEnum.ERROR.getMessage());
    }

    public void setCode(Integer code){
        this.code = code;
    }
    public void setMessage(String message){
        this.statusInfo = message;
    }
    public void setData(T data){
        this.data = data;
    }
    public Integer getCode(){
        return this.code;
    }
    public String getMessage(){
        return this.statusInfo;
    }
    public T getData(){
        return this.data;
    }

    @Override
    public String toString() {
        return (new StringJoiner(", ", Result.class.getSimpleName() + "[", "]"))
                .add("code=" + this.code)
                .add("statusInfo='" + this.statusInfo + "'")
                .add("data=" + this.data)
                .toString();
    }


}
