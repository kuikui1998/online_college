package com.hkk.eduservice.controller;

import com.hkk.commonutils.R;
import org.springframework.web.bind.annotation.*;

/**
 * @auther kuikui
 * @create 2020-09-19 15:01
 */
@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin
public class EduLoginController {

    //login
    @PostMapping("login")
    public R login(){

        return R.ok().data("token","admin");
    }

    //info
    @GetMapping("info")
    public R info(){

        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }

}