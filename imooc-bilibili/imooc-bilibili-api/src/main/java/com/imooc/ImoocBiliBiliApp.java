package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImoocBiliBiliApp {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(ImoocBiliBiliApp.class,args);
    }
}
