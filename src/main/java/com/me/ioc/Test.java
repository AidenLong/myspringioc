package com.me.ioc;

import com.me.ioc.factory.ApplicationContext;
import com.me.ioc.factory.ClassPathXMLApplicationContext;
import com.me.ioc.service.StudentService;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXMLApplicationContext("application.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("StudentService");
        System.out.println(studentService.getStudent().toString());
    }
}
