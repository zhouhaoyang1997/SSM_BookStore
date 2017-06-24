import javax.annotation.Resource;

import com.entry.User;
import com.service.UserService;
import com.serviceimpl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.alibaba.fastjson.JSON;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestDao {
    private static Logger logger = Logger.getLogger(TestDao.class);
    @Resource
    private UserService userService = null;
    @Test
    public void test1() {
        User user = userService.selectById(1);
        logger.info(JSON.toJSONString(user));
    }
}