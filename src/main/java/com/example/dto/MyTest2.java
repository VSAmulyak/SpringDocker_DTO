package com.example.dto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.MyTest;

@SpringBootApplication
@RestController
public class MyTest2 {

    public static void main(String[] args) {  SpringApplication.run(MyTest2.class ,  args);}

        @RequestMapping("/")
        public String welcome()
        {
            sayHello();
            MyTest.sayHello();
            return "Welcome to docker application";
        }

    public static void sayHello() {
        System.out.println("MyTest2 says hello!");
    }





}
