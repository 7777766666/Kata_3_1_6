package org.rest;

import org.rest.configuration.MyConfig;
import org.rest.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);


    Communication communication = configApplicationContext.getBean("communication", Communication.class);

    List<User> userList = communication.getAllUsers();
        System.out.println(userList);


    }
}
