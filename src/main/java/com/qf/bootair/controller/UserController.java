package com.qf.bootair.controller;

import com.qf.bootair.entity.R;
import com.qf.bootair.entity.Users;
import com.qf.bootair.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @Date 2023/5/29 19:16
 * @Author 人来疯
 * Version v1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    final UserService userService;

    @PostMapping("login")
    public R login(@RequestBody Users user){
        Users loginUser=userService.login(user.getUsername(),user.getPassword());
        if (Objects.nonNull(loginUser)){
            return R.ok(loginUser);
        }
        return R.fail("登录失败");
    }
}
