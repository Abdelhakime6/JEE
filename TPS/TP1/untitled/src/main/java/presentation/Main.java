package presentation;

import dao.Student;
import dao.StudentDAO;
import dao.StudentDaodict;
import metier.StudentManager;

public class Main {

    public static void main(String[] args) {

        StudentDaodict studentDAO = new StudentDaodict();
        StudentManager studentManager = new StudentManager(studentDAO);

        Student s1 = new Student(1, "a7em", 20, "a7em@example.com");
        Student s2 = new Student(2, "wesh", 22, "h2uh@example.com");
        Student s3 = new Student(3, "yep", 21, "huh@example.com");

        studentManager.addstudent(s1);
        studentManager.addstudent(s2);
        studentManager.addstudent(s3);

        System.out.println(studentDAO.getallstudents());
    }
}
