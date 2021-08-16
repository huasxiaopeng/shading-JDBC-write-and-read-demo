package shardingjdbc.read.write.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import shardingjdbc.read.write.demo.domain.User;

import java.util.List;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/16
 * @desc
 */
@Repository
@Mapper
public interface UserMapper {

    int insert(User record);

    List<User> list();
}
