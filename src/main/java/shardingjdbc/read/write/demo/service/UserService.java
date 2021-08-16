package shardingjdbc.read.write.demo.service;

import shardingjdbc.read.write.demo.domain.User;

import java.util.List;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/16
 * @desc
 */
public interface UserService {
    Integer insert(User user);

    List<User> list();
}
