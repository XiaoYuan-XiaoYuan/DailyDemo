package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

//    //这个注解用来管理bean的生命周期 管理bean的初始化的方法    在构造器被调用完之后执行
//    @PostConstruct
//    public void init(){
//        // 解决netty启动冲突的问题
//        // 见Netty4Utils.setAvailableProcessors()
//        System.setProperty("es.set.netty.runtime.available.processors","false");
//    }

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}
