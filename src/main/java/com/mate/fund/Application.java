package com.mate.fund;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages = {"com.mate"})
@MapperScan("com.mate.fund.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
