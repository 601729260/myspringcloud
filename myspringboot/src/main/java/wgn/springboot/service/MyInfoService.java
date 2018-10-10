package wgn.springboot.service;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.impl.KetamaMemcachedSessionLocator;
import net.rubyeye.xmemcached.utils.AddrUtil;
import org.springframework.stereotype.Service;
import wgn.aspect.annotation.MyInfoAnnotation;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Service
public class MyInfoService implements MyInfoServiceIntf {

    private MemcachedClient memcachedClient;
    @MyInfoAnnotation("FCC")
    public String testBusiness() {

        return "business";
    }

    public MyInfoService() throws IOException {

        MemcachedClientBuilder builder = new XMemcachedClientBuilder(
                AddrUtil.getAddresses("172.28.1.129:11211"));
        builder.setSessionLocator(new KetamaMemcachedSessionLocator());
        this.memcachedClient=builder.build();
    }

    public void testMemecache() {


        try {
            memcachedClient.beginWithNamespace("PRICE_CITY_BELONG_COMPANY");
            System.out.println((String) memcachedClient.get("cityNumId:320500"));
            memcachedClient.endWithNamespace();

        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } catch (MemcachedException e1) {
            e1.printStackTrace();
            e1.printStackTrace();
        } catch (TimeoutException e1) {
            e1.printStackTrace();
        }

    }

}