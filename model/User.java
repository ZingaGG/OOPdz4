// Реализовать абстрактный класс User и его наследники Student и Teacher.
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
// наследники собственные параметры (какие, по вашему выбору – Пример:
// studentId для Student, teacherId для Teacher)

package model;

public abstract class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" +
                "Surname = " + surname + "\n";
    }

    
    
}