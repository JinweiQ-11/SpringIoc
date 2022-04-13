package com.example.demo;

import com.example.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.*;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/5 22:54
 * @description：
 * @modified By：
 * @version: $
 */
public class UserDaoDemo {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(),
                new ThreadFactory() {
                    public Thread newThread(Runnable r) {
                        return new Thread(r);
                    }
                },new ThreadPoolExecutor.AbortPolicy());
        applicationContext.close();
    }
}
