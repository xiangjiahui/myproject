package com.xjh.myproject.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 123
 */
@Controller
@RequestMapping("/vue")
@Api(tags = "Vue的学习控制类")
public class VueController {

    @GetMapping("/getVue")
    @ApiOperation(value = "第一个Vue方法")
    public String vue(){
        //如果templates文件下有多层目录，那么直接return "上层目录/xxx.html"
//        return "vue/vue";
        return "vue";
    }

    @GetMapping("/getVue2")
    @ApiOperation(value = "vue的基本事件的使用")
    public String vue2(){
        return "vue2";
    }

    @GetMapping("/getVue3")
    @ApiOperation(value = "vue的计算属性的使用")
    public String vue3(){
        return "vue3";
    }
}
