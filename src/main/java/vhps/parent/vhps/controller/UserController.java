package vhps.parent.vhps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vhps.parent.vhps.bean.User;
import vhps.parent.vhps.service.UserService;

/**
 * @Author CRJ
 * @Date 2022.01.25/2022/1/25
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("insert")
    public int insert(User user){
        return userService.insertUser(user);
    }

    @RequestMapping("select")
    public User select(int id){
        return userService.selectUser(id);
    }


}
