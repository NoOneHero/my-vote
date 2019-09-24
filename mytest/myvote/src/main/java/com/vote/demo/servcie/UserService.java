package com.vote.demo.servcie;

import com.vote.demo.entity.User;
import org.springframework.stereotype.Service;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 09:42
 */
@Service
public class UserService {
    /**
     * 根据id查询user
     *
     * 这里模拟查询用户
     * @param id
     * @return
     */
    public User getUser(int id){
        if (id == 1){
            return new User();
        }
        return null;
    }
}
