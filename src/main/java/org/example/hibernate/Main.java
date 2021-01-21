package org.example.hibernate;

import org.example.hibernate.config.HibernateConfig;
import org.example.hibernate.model.User;
import org.example.hibernate.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HibernateConfig.class);

        UserService userService = context.getBean(UserService.class);

        createTestUsers(userService);
//        userService.removeUserById(1);

//        User user2 = userService.getUserById(1);
//        System.out.println(user2);

        printListUsers(userService.listUsers());

//        userService.update(5, new User("Bob", "bob@mail.ru"));
    }

    public static void printListUsers(List<User> users) {
        for (User user : users) {
            System.out.println("Id = "+user.getId());
            System.out.println("Name = "+user.getName());
            System.out.println("Email = "+user.getEmail());
            System.out.println();
        }
    }

    public static void createTestUsers(UserService userService) {
        userService.add(new User("Mike", "mike@mail.ru"));
        userService.add(new User("Sam", "sam@mail.ru"));
        userService.add(new User("Alex", "alex@mail.ru"));
        userService.add(new User("Dina", "dina@mail.ru"));
        userService.add(new User("Van", "van@mail.ru"));
        userService.add(new User("Helen", "helen@mail.ru"));
        userService.add(new User("Liza", "liza@mail.ru"));
    }
}
