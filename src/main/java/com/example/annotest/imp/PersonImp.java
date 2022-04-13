package com.example.annotest.imp;

import com.example.annotest.Person;
import org.springframework.stereotype.Component;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 16:11
 * @description：
 * @modified By：
 * @version: $
 */
@Component("personDao")
public class PersonImp  implements Person {
    @Override
    public void save() {
         System.out.println("personDao" + "save");
    }
}
