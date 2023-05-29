package com.qf.bootair;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.annotation.Resource;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@SpringBootTest
class BootAirApplicationTests {
    @Value("${spring.mail.username}")
    String username;
    @Resource
    JavaMailSender mailSender;

    @Test
    void contextLoads() {

        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom(username);
        message.setTo(username,"2366265450@qq.com");
        message.setSubject("晚上吃烧烤");
        message.setText("羊肉串，烤羊腰");
        message.setSentDate(new Date());
        mailSender.send(message);
    }
    @Test
    void sendMimeMail() throws MessagingException {
        MimeMessage mimeMessage=mailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);
        helper.setFrom(username);
        String[] to={username,"2366265450@qq.com","2827930793@qq.com"};
        helper.setTo(to);
        helper.setSubject("发送一个富文本消息");
        helper.setSentDate(new Date());
        helper.setText("<h1 style='color:red'>右键的富文本正文</h1>",true);
        mailSender.send(mimeMessage);
    }
}
