package controller;

import java.util.ArrayList;
import java.util.List;

import GroupService.StudyGroupService;
import group.StudyGroup;
import model.Student;
import model.Teacher;
import model.Type;
import service.DataService;
import view.StudentView;
import view.TeacherView;

public class Controller {
    
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudyGroupService groupService = new StudyGroupService();

    public void createStudent(String name, String surname){
        service.createUser(name, surname, Type.Student);
    }

    public void createTeacher(String name, String surname){
        service.createUser(name, surname, Type.Teacher);
    }

    public List<Student> getStudents(){
        List<Student> list = service.getAllStudents();
        for (Student student : list) {
            studentView.printStudent(student);
        }
        return list;
    }

    public List<Teacher> getTeachers(){
        List<Teacher> list = service.getAllTeachers();
        for (Teacher teacher : list) {
            teacherView.printTeacher(teacher);
        }
        return list;
    }

    public StudyGroup createGroup(){
        List<Student> students = getStudents();
        Teacher teacher = service.createTeacher("Ivan", "Ivanov");
        StudyGroup studyGroup = groupService.createStudyGroup(teacher, students);
        return studyGroup; 
    }
}
