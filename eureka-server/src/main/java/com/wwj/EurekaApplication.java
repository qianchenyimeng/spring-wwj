package com.wwj;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 项目名称：spring-wwj
 * 类名称：EurekaApplication
 * 类描述：
 * 创建人：wuwenjin
 * 创建时间：2024/12/3
 * 修改人：
 * 修改时间：2024年12月12日15:53:16
 * 修改备注：上传到github上
 *
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
    }
}
