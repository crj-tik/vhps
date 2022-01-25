package vhps.parent.vhps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhps.parent.vhps.bean.User;
import vhps.parent.vhps.dao.UserMapper;

/**
 * @Author CRJ
 * @Date 2022.01.25/2022/1/25
 **/

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(int id){
        return userMapper.selectUser(id);
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }
}
