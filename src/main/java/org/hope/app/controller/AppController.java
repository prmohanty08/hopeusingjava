package org.hope.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("hello")
    public String sayHello(){
        return ("<b>Hello</b>, SpringBoot on Wildfly");
    }
}