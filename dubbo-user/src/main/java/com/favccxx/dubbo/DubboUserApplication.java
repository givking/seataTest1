package com.favccxx.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.favccxx.dubbo.mapper")
public class DubboUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboUserApplication.class, args);
	}

}
