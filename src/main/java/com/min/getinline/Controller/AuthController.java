package com.min.getinline.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")   //  로그인
    public String login(){
        return "auth/login";
    }

    @GetMapping("/sing-up") //  사인업
    public String singUp(){
        return "auth/sing-up";
    }

}
