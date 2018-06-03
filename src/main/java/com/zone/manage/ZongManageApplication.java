package com.zone.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ZongManageApplication extends WebMvcConfigurerAdapter {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //每当访问   http://xxx/view/xxxx  的时候  就自动寻找项目classes下的 /view/ 的内容
        registry.addResourceHandler("/view/**").addResourceLocations("/view/");
        //这里没有配置 /static/**  也能直接访问 是因为 spring 默认是可以访问到以下目录的
        // classpath:/META-INF/resources/,
        // classpath:/resources/,
        // classpath:/static/,
        // classpath:/public/
        //如果不配置view 就没办法访问到view中的文件了
    }

    public static void main(String[] args) {
        SpringApplication.run(ZongManageApplication.class, args);
    }
}
