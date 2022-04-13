package com.example.service.imp;

import com.example.UserDao;
import com.example.service.UserServcie;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.*;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/7 22:57
 * @description：
 * @modified By：
 * @version: $
 */
public class UserServiceImp implements UserServcie {
    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {

        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImp() {

    }

    @Override
    public void save() {
        userDao.save();
    }
}
