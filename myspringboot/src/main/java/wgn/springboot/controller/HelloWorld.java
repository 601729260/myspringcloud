package wgn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    @RequestMapping("/helloworld")
    @ResponseBody
    public String home() {
        return "Hello World test!";
    }
}
