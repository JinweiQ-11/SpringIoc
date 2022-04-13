import com.example.service.UserServcie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 18:28
 * @description：
 * @modified By：
 * @version: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class SringJunitTest {
    @Autowired
    private UserServcie userServcie;

    @Test
    public void test(){
        userServcie.save();
    }
}
