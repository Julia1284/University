package ru.yulialyapushkina.university.entity;

public class Student implements CommonAction, StudentAction {
    private String surname;
    private Professor professor;

    public Student(String surname) {
        this.surname = surname;
    }

    public Student() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void goToUniversity() {
        System.out.println("Студент идет в университет, чтобы учиться");
    }

    @Override
    public void preparingForExam() {
        System.out.println("Студент готовится к экзаменам. Он буден сдавать экзамен у профессора " + professor.getSurname());
    }
}
