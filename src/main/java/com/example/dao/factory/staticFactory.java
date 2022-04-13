package com.example.dao.factory;

import com.example.UserDao;
import com.example.dao.imp.UserDaoImpl;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/7 0:05
 * @description：
 * @modified By：
 * @version: $
 */
public class staticFactory {
    public static UserDao getUserDao(){
        return  new UserDaoImpl();
    }
}
