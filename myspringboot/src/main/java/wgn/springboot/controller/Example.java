package wgn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wgn.aspect.annotation.MyInfoAnnotation;

@RestController
public class Example {

    @MyInfoAnnotation("hahhaha")
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}