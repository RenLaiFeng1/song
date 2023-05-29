package com.qf.bootair.utils;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Date;

/**
 * @Date 2023/5/29 19:08
 * @Author 人来疯
 * Version v1.0
 */
@Component
public class MailUtils {
    private static MailUtils INSTANCE = new MailUtils();

    @Resource
    JavaMailSender mailSender;

    @PostConstruct
    public void init(){
        INSTANCE.mailSender = mailSender;
    }

    /**
     * 发送简单邮件
     *
     * @param subject 主题
     * @param content 内容
     * @param from 发件人
     * @param to      收件人
     */
    public static void sendSimpleMail(String subject,String content,String from,String... to){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        // 主题
        message.setSubject(subject);
        // 邮件正文
        message.setText(content);
        message.setSentDate(new Date());
        // 发送邮件
        INSTANCE.mailSender.send(message);
    }

}
