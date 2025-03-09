package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements doas {

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
