package com.example.dao.factory;

import com.example.UserDao;
import com.example.dao.imp.UserDaoImpl;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/7 19:47
 * @description：
 * @modified By：
 * @version: $
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return  new UserDaoImpl();
    }

}
