package com.qf.bootair.service.impl;



import com.qf.bootair.dao.UsersDao;
import com.qf.bootair.entity.Users;
import com.qf.bootair.service.UserService;
import com.qf.bootair.utils.MailUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * @Date 2023/5/29 19:09
 * @Author 人来疯
 * Version v1.0
 */
@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    final UsersDao usersDao;

    @Value("${spring.mail.username}")
    String rootEmail;

    @Override
    public Users login(String name, String password) {
        List<Users> users=usersDao.findByUsername(name);
        for (Users user : users) {
            if (Objects.equals(user.getPassword(),password)){
                String subject="欢迎"+name+"登陆成功";
                String content="邮件正文";
                MailUtils.sendSimpleMail(subject,content,rootEmail,user.getEmail());
                return user;
            }
        }
        return null;
    }
}
