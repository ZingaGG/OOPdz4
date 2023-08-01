package group;

import java.util.List;

import model.Student;
import model.Teacher;

public class StudyGroup {
    Teacher teacher;
    List<Student> studentList;
    
    public StudyGroup(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.studentList = students;
    }
}
