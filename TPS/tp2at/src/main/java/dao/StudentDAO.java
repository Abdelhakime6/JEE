package dao;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("dao")
public class StudentDAO implements Idao {

    List<Student> students;

    public StudentDAO() {
        this.students = new ArrayList<>();
    }
    @Override
    public Student addstudent(Student student){
        students.add(student);
        return student;
    }
    @Override
    public List<Student> getallstudents(){
        return students;
    }
}

