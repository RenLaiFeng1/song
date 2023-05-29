package com.qf.bootair.controller;

import com.wf.captcha.SpecCaptcha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date 2023/5/29 17:20
 * @Author 人来疯
 * Version v1.0
 */
@RestController
public class CaptchaController {

    @GetMapping("captcha")
    public void captcha(HttpServletResponse response)throws IOException {
        SpecCaptcha captcha=new SpecCaptcha();
        captcha.setWidth(300);
        captcha.setHeight(200);
        System.out.println("验证码是："+captcha.text());
        response.setHeader("content-type","image/jpeg");
        captcha.out(response.getOutputStream());
    }
}
