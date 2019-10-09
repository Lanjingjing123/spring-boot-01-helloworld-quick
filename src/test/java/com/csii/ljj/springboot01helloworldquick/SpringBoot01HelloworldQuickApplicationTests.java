package com.csii.ljj.springboot01helloworldquick;

import com.csii.ljj.springboot01helloworldquick.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 可以在容器运行中，自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldQuickApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;


    /**
     * 使用配置类进行bean的注入
     */
    @Test
    public void confTest(){
        boolean b = ioc.containsBean("helloService2");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
