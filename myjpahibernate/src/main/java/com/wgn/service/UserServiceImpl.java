package com.wgn.service;

import com.wgn.DAO.UserRepository;
import com.wgn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Company        :   mamahao.com
 * author         :   wangguannan
 * Date           :   2018/8/25
 * Time           :   下午3:47
 * Description    :
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(rollbackFor = Exception.class)
    public Integer insertUsers(){
        Integer integer=0;
        User user = new User();
        user.setAge("24");
        user.setName("jkj");
        integer++;
        userRepository.save(user);

        User user1 = new User();
        user1.setAge("24");
        user1.setName("wyy");
        integer++;
        userRepository.save(user1);
        return integer;
    }
}
