package com.csii.ljj.springboot01helloworldquick.conf;

import com.csii.ljj.springboot01helloworldquick.bean.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaAppConfig {
    // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService2(){
        System.out.println("配置类@bean添加到容器中");
        return new HelloService();
    }
}
