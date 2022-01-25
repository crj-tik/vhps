package vhps.parent.vhps.dao;

import org.springframework.stereotype.Component;
import vhps.parent.vhps.bean.User;

/**
 * @Author CRJ
 * @Date 2022.01.25/2022/1/25
 **/

@Component
public interface UserMapper {

    int insertUser(User user);

    User selectUser(int id);

}
