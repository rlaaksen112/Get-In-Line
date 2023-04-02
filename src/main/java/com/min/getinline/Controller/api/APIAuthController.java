package com.min.getinline.Controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController //  Controller 에 ResponseBody가 추가된 기능
public class APIAuthController {

    @GetMapping("/sing-up")
    public String singUp(){
        return "done.";
    }

    @GetMapping("/login")
    public String login(){
        return "done.";
    }
}

