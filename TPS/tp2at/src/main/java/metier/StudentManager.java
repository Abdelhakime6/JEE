package metier;

import dao.Idao;
import dao.Student;
import dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentManager implements IMetier{
    @Autowired
    @Qualifier("dao")
    Idao studentDAO;

    public void setStudentDAO(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }
@Override
    public Student addstudent(Student student){
        for (Student s : studentDAO.getallstudents()){
            if (s.getEmail().equals(student.getEmail())){
                System.out.println(student.getEmail() + " already exists");
                return null;
            }
        }

            return studentDAO.addstudent(student);
    }
}
