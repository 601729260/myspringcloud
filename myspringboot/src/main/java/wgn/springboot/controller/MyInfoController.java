package wgn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wgn.springboot.service.MyInfoServiceIntf;

@RestController
@RequestMapping("/business")
public class MyInfoController {

    @Autowired
    private MyInfoServiceIntf myInfoServiceIntf;
    @RequestMapping("/test")
    public String testBusiness() {
        return myInfoServiceIntf.testBusiness();
    }

}
