package presentation;

import dao.Student;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        Student s1 = new Student(1, "said", 20, "said@example.com");
        Student s2 = new Student(2, "reda", 22, "reda@example.com");
        Student s3 = new Student(3, "said2", 21, "said@example.com");

        metier.addstudent(s1);
        metier.addstudent(s2);
        metier.addstudent(s3);
    }
}
