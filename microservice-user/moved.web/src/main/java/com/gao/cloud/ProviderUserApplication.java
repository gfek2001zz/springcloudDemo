package com.gao.cloud;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({
    "classpath*:configs/*.service.xml",
    "classpath*:configs/*.beans.xml",
    "classpath*:configs/*.configs.xml"
})
@MapperScan(basePackages = {"com.gao.cloud.dao"})
public class ProviderUserApplication {

    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());

        return registration;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }
}
