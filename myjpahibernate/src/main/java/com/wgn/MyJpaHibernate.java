package com.wgn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Company        :   mamahao.com
 * author         :   wangguannan
 * Date           :   2018/8/25
 * Time           :   下午3:33
 * Description    :
 */
@SpringBootApplication
@ComponentScan(value="com.wgn")
public class MyJpaHibernate {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyJpaHibernate.class, args);
    }
}
