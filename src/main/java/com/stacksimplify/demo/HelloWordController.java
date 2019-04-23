package com.stacksimplify.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from  Github11 for webhook via pipeline";
    }

}
