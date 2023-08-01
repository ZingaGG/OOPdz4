// � Создать класс DataService с методами по управлению сущностями User
// (create, read) и агрегирующий всех пользователей заведенных в системе
// � StudentId должны быть созданы по алгоритму – максимальный id в
// коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
// элементов и instanceOf


package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class DataService {
    List<User> userlist;

    public void createUser(String name, String surname, Type type){
        int id = getFreeID(type);
        if (Type.Student == type){
            Student student = new Student(name, surname, id);
            userlist.add(student);
        }

        if (Type.Teacher == type){
            Teacher teacher = new Teacher(name, surname, id);
            userlist.add(teacher);
        }
    }

    public Teacher createTeacher(String name, String surname){
        int id = getFreeID(Type.Teacher);
        Teacher teacher = new Teacher(name, surname, id);
        userlist.add(teacher);
        return teacher;
    }

    private int getFreeID(Type type){
        boolean isStudent = Type.Student == type;
        int lastID = 1;
        for (User user : userlist) {
            if (user instanceof Teacher && !isStudent){
                lastID = ((Teacher) user).getteacherID() + 1;
            }

            if(user instanceof Student && isStudent){
                lastID = ((Student) user).getStudentID() + 1;
            }

        }
        return lastID;
    }

    public User getUserByID(Type type, int id) throws Exception{
        boolean isStudent = Type.Student == type;

        for (User user : userlist) {
            if((user instanceof Teacher) && (!isStudent) && (((Teacher) user).getteacherID() == id)){
                return user;
            }

            if((user instanceof Student) && (isStudent) && (((Student) user).getStudentID() == id)){
                return user;
            }
        }
        throw new Exception("Wrong ID!");
    }

    public List<Student> getAllStudents(){
        List<Student> list = new ArrayList<>();
        for (User user : userlist) {
            if(user instanceof Student){
                list.add((Student) user);
            }
        }
        return list;
    }

    public List<Teacher> getAllTeachers(){
        List<Teacher> list = new ArrayList<>();
        for (User user : userlist) {
            if(user instanceof Teacher){
                list.add((Teacher) user);
            }
        }
        return list;
    }

    public List<User> getAllUsers(){
        return userlist;
    }
}
