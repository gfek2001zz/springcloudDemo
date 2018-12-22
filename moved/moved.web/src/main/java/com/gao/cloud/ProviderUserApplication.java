package com.gao.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({
    "classpath*:configs/*.service.xml",
    "classpath*:configs/*.beans.xml",
    "classpath*:configs/*.configs.xml"
})
@MapperScan(basePackages = {"com.gao.cloud.dao"})
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }
}
