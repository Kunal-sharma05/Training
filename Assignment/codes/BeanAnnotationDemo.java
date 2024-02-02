package com.hexaware.beanindetail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Student student1 = context.getBean(Student.class);
            Student student2 = (Student) context.getBean("student");
            student2.print();
            String[] beanNames = context.getBeanDefinitionNames();
            for (String obj : beanNames) {
                System.out.println(obj);
            }
        }
    }
}
