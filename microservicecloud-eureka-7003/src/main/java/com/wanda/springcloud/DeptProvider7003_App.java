package com.wanda.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class DeptProvider7003_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SpringApplication.run(DeptProvider7003_App.class, args);
	}

}
