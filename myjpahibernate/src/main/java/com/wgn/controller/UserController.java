package com.wgn.controller;

import com.wgn.DAO.UserRepository;
import com.wgn.service.UserService;
import com.wgn.untils.StackTraceLogUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company        :   mamahao.com
 * author         :   wangguannan
 * Date           :   2018/8/25
 * Time           :   下午3:44
 * Description    :
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;



    /**
     * 事务测试 写入两条数据
     */
    @PostMapping("/insertUserTwo")
    public void insertUserTwo(){
        try {
            userService.insertUsers();
        } catch (Exception e) {
            logger.error(StackTraceLogUtil.getStackTraceAsString(e));
        }
    }


}