package xyz.korme.fastfation.controller;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.korme.fastfation.mapper.Hellotest;

@RestController
public class testA {
    @Autowired
    Hellotest hellotest;
    @RequestMapping(value = "hello")
    public String hello(int id){
        String t=hellotest.hel(id);
        return t;
    }

}
