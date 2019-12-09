package com.studyspringboot.studyspringboot.controller.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Createc by lwx0y01 on 2019/12/9
 */
@RestController
@RequestMapping(value = "api")
public class HelloController {

    @RequestMapping(value = "hello")
    public @ResponseBody String sayHello() {
        return "hello world;";
    }

}
