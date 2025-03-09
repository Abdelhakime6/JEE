package metier;

import dao.Student;
import dao.doas;

public class StudentManager {
    doas studentDAO;

    public StudentManager(doas studentDAO) {
        this.studentDAO = studentDAO;
    }

    public Student addstudent(Student student){
        for (Student s : studentDAO.getallstudents()){
            if (s.getEmail().equals(student.getEmail())){
                System.out.println(student.getEmail() + "already exists");
                return null;
            }
        }

        return studentDAO.addstudent(student);
    }
}
