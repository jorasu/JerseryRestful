package com.example.jserseyrestful.config;

import com.example.jserseyrestful.controller.StudentController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;


@Configuration
//上下文路径，也可以配置在application.properties,未配置的话就是所有/*请求，当前为/jersey/*
@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        //在这里注册相关controller或者需要的特性支持
        register(StudentController.class);

    }


}
