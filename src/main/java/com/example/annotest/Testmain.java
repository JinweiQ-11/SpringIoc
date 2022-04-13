package com.example.annotest;
import com.example.annotest.configuration.SpringConfig;
import com.example.service.UserServcie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 16:19
 * @description：
 * @modified By：
 * @version: $
 */
public class Testmain {
    public static void main(String[] args) throws SQLException {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
//        PersonService perService = (PersonService) applicationContext.getBean("PersonService");
//        perService.doService();
         ApplicationContext applicationContex = new AnnotationConfigApplicationContext(SpringConfig.class);
         DataSource dataSource = (DataSource) applicationContex.getBean("dataSource01");
         System.out.println(dataSource.getConnection());
    }
}
