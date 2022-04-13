package com.example.annotest.configuration;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;
import java.sql.Connection;
/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 17:41
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
@ComponentScan("com.example")
@Import({DataSourceConfiguration.class}) //导入分的配置到总的核心配置
//<context:component-scan base-package="com.example"/>
public class SpringConfig {

}
