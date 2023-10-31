import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-16 15:50
 * @description :
 */
@SpringBootTest
public class Test {


    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
    * 用于测试:
    */
    @org.junit.Test
    public void test01()
    {
        String encode = passwordEncoder.encode("123456");
        System.out.println("encode = " + encode);


    }
}
