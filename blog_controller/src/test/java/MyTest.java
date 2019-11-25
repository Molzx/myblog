/**
 * FileName: MyTest
 * Author:   xuzhenghao
 * Date:     2019/11/25 15:38
 * Description: Test测试类
 */

import com.alibaba.fastjson.JSONObject;
import com.xzh.blog.MyBlogApplication;
import com.xzh.blog.entity.User;
import com.xzh.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

/**
 * 〈Test测试类〉
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyBlogApplication.class})
public class MyTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        User u=new User();
        u.setCreatedTime(LocalDateTime.now());
        System.out.println(u.getCreatedTime());
        System.out.println("---------------------");
        User a=userService.findByID(1);
        System.out.println(a.getCreatedTime()+"时间");
        System.out.println( JSONObject.toJSONString(a));
    }
}
