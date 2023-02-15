package com.yby.demo;

import com.yby.user.DemoApplication;
import com.yby.user.event.Person;
import com.yby.user.event.PersonEventService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class PersonEventTest {

    @Resource
    private PersonEventService personEventService;

    @Test
    public void test() {
        Person person = new Person();
        person.setName("经典鸡翅");
        person.setAge(18);
        personEventService.creatPerson(person);
    }

}
