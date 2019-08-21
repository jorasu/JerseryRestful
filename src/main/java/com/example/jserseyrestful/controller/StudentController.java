package com.example.jserseyrestful.controller;

import com.example.jserseyrestful.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * Jersey Restful写法
 */
@Path("/student")
public class StudentController{
    @Autowired
    private StudentService studentService;


    @GET
    @Path("/getStu")
    @Produces(MediaType.APPLICATION_JSON)
    public   List<Map<String, Object>> query(){
        return studentService.query();
    }

    @GET
    @Path("/hello")
    public String hello() {
        return "hello";
    }


}
/*
springMvc的写法
@RestController
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping(value="/getStu" ,method = RequestMethod.GET)
    List<Map<String, Object>> query(){
        return studentService.query();
    };

}
*/
