package com.example.demo;

import com.example.UserDao;
import com.example.service.UserServcie;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/7 23:00
 * @description：
 * @modified By：
 * @version: $
 */
public class UserController {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserServcie userService = (UserServcie) applicationContext.getBean("userService");
        userService.save();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(),
//                new ThreadFactory() {
//                    public Thread newThread(Runnable r) {
//                        return new Thread(r);
//                    }
//                },new ThreadPoolExecutor.AbortPolicy());
//        applicationContext.close();
    }
}
