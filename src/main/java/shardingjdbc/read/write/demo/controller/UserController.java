package shardingjdbc.read.write.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shardingjdbc.read.write.demo.domain.User;
import shardingjdbc.read.write.demo.service.UserService;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/16
 * @desc
 */
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Object list() {
        return userService.list();
    }

    @GetMapping("/insert")
    public Object insert(@RequestParam String username, @RequestParam String  password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userService.insert(user);
    }
}
