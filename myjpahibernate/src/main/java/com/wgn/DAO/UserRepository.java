package com.wgn.DAO;

import com.wgn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Company        :   mamahao.com
 * author         :   wangguannan
 * Date           :   2018/8/25
 * Time           :   下午3:42
 * Description    :
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    //通过年龄来查询数据
    public List<User> findUserByAge(String age);

}