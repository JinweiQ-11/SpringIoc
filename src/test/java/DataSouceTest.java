import com.alibaba.druid.pool.DruidDataSource;
import com.example.service.UserServcie;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;
/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 13:12
 * @description：
 * @modified By：
 * @version: $
 */
public class DataSouceTest {

    // c3po
    @Test
    public void test() throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/example");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("root");
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println(connection);
        comboPooledDataSource.close();
    }
    // druid
    @Test
    public void test1() throws Exception {
      DruidDataSource dataSource = new DruidDataSource();
      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/example");
      dataSource.setUsername("root");
      dataSource.setPassword("root");
      Connection connection = dataSource.getConnection();
      System.out.println(connection);
      connection.close();
    }
    // 配置文件
    @Test
    public void test2() throws Exception {
        // 读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("jdbc"); // 相对类加载路径
        String driver = rb.getString("jdbc.driver");
        String url =  rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password  = rb.getString("jdbc.password");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    // 容器
    @Test
    public void test3() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
