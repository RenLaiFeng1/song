package com.qf.bootair.service;

import com.qf.bootair.entity.Users;

/**
 * @Date 2023/5/29 19:09
 * @Author 人来疯
 * Version v1.0
 */
public interface UserService {
    Users login(String name,String password);
}
