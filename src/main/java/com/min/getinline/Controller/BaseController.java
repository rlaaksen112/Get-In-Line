package com.min.getinline.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {    //  implements ErrorController == 내가 만드려는 에러 페이지를 기본적으로 생성 해주고있기 때문에 기본이아닌 이게 에러 페이지다 라는걸 인식 시켜 줘야함.

    @GetMapping("/")    // 홈 화면
    public String root(){
        return "index";
    }

    @RequestMapping("/error")   // 에러 페이지
    public String error(){
        return "error";
    }


}
