package wgn.springboot.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyInfoServiceTest extends BaseSpringTester{
    @Autowired
    private MyInfoServiceIntf myInfoService;
    @Test
    public void businessTest()
    {

        System.out.println(myInfoService.testBusiness());
    }

    @Test
    public void testMemecache()
    {
        new Thread(()->{
         myInfoService.testMemecache();
         System.out.println(Thread.currentThread());
        }).start();
        myInfoService.testMemecache();
        System.out.println(Thread.currentThread());
    }
}

