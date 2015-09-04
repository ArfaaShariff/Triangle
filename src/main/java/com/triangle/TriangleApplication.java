package com.triangle;

import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TriangleApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(TriangleApplication.class, args);
        AbstractApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        factory.registerShutdownHook();
        triangle triangle =(triangle) factory.getBean("triangle");

        triangle.draw();

    }
}
