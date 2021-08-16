package shardingjdbc.read.write.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shardingjdbc.read.write.demo.domain.User;
import shardingjdbc.read.write.demo.repository.UserMapper;

import java.util.List;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/16
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}