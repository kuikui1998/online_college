package com.hkk.servicebase.exceptionhandler;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther kuikui
 * @create 2020-09-15 20:08
 */
@Data
@AllArgsConstructor //生成有参数构造方法
@NoArgsConstructor  //生成无参数构造
public class GuliException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code;

    private String msg;//异常信息
}
