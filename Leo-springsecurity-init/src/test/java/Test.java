import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-15 0:17
 * @description :
 */
@SpringBootTest
public class Test {


    /**
    * 用于测试:
    */
    @org.junit.Test
    public void test()
    {
        String str = "2【 微信号：itcodeba 】.png";
        String substring = str.substring(0, 1);
        System.out.println("substring = " + substring);
    }
}
