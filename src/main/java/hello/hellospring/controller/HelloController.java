package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")//맵 어플리케이션에서 /hello 라고 입력되면 해당 메소드 호출
    //HTTP GET,POST 방식 중 GET 방식으로 받는다는 소리임.
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello";
    }
}
