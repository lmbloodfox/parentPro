package com.windfox;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        int port = 8081;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.println("端口号被占用");
            System.exit(1);
        }
//        SpringApplication.run(EurekaServerApplication.class,args);
        new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port=" + port).run(args);
        System.out.println("项目启动成功");
    }

}
