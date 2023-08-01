// Реализовать абстрактный класс User и его наследники Student и Teacher.
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
// наследники собственные параметры (какие, по вашему выбору – Пример:
// studentId для Student, teacherId для Teacher)

package model;

public class Student extends User{
    private Integer studentID;

    public Student(String name, String surname, int id){
        super(name, surname);
        this.studentID = id;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "ID = " + studentID + "\n";
    }

    
    
}
