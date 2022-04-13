package com.example.annotest.imp;
import com.example.annotest.Person;
import com.example.annotest.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 16:13
 * @description：
 * @modified By：
 * @version: $
 */
@Component("PersonService")
@Scope("prototype")
public class PersonServiceImp  implements PersonService {
    @Value("${jdbc.drive}")
    private String driver;
//    @Autowired
//    @Qualifier("personDao")
    @Resource(name = "personDao")
    private Person person;
    @Override
    public void doService() {
        person.save();
    }
    // 初始化
    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }
}
