package org.es.controller;

import org.es.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @RequestMapping("/api/person")
    @ResponseBody
    public Person test1(){
        Person person = new Person("Ethan",30);

        return  person;
    }

    @RequestMapping("/web/login")
    public String login(){
        return "index";
    }
}