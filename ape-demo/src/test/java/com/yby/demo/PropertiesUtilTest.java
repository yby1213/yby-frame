package com.yby.demo;

import com.yby.tool.PropertiesUtils;
import com.yby.user.DemoApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@Slf4j
public class PropertiesUtilTest {

    @Test
    public void test() throws Exception {
        String test = PropertiesUtils.getInstance().getPropertyValue("test", "ape.name");
        log.info("test:{}", test);
    }


}
