package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDAODICT implements Idao {
    Map<Integer, Student> mapstudents;

    public StudentDAODICT() {
        this.mapstudents = new HashMap<>();
    }

    @Override
    public Student addstudent(Student student) {
        mapstudents.put(student.getId(), student);
        return student;
    }

    @Override
    public List<Student> getallstudents() {
        return new ArrayList<>(mapstudents.values());
    }
}
