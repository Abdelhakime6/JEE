package presentation;

import config.AppConfig;
import dao.Student;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        Student s1 = new Student(1, "said", 20, "said@example.com");
        Student s2 = new Student(2, "reda", 22, "reda@example.com");
        Student s3 = new Student(3, "said2", 21, "said@example.com");
        String s = "abc";
        s.toLowerCase().charAt(2);
        metier.addstudent(s1);
        metier.addstudent(s2);
        metier.addstudent(s3);
}}
