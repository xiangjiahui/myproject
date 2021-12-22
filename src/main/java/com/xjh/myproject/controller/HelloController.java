package com.xjh.myproject.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 向嘉晖
 */
@Controller
@Api(tags = "hello控制类")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    @ApiOperation(value = "hello方法",notes = "notes里面的是详细的内容")
    public String hello(){
        return "Hello World";
    }
}
