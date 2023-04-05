package org.example.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Integer code;//响应码
    private String msg;//响应信息
    private T data;//返回的数据

    //增删改成功响应
    public static <T> Result<T> success(){
        return new Result<>(1,"success",null);

    }
    //查询成功响应
    public static Result success(Object data){
        return new Result(1,"success",data);

    }
    //失败响应
    public static Result error(String msg){
        return new Result(0,msg,null);

    }
}
