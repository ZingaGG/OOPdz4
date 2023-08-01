// Реализовать абстрактный класс User и его наследники Student и Teacher.
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
// наследники собственные параметры (какие, по вашему выбору – Пример:
// studentId для Student, teacherId для Teacher)

package model;

public class Teacher extends User{
    private Integer teacherID;

    public Teacher(String name, String surname, int id){
        super(name, surname);
        this.teacherID = id;
    }

    public Integer getteacherID() {
        return teacherID;
    }

    public void setteacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "ID = " + teacherID + "\n";
    }
    
}