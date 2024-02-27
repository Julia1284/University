package ru.yulialyapushkina.university.entity;

public class Professor implements CommonAction, ProfessorAction {
    private String surname;
    private Student student;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void goToUniversity() {
        System.out.println("Профессор идет в университет, чтобы учить");
    }

    @Override
    public void writingDissertation() {
        System.out.println("Профессор пишет диссертацию,  ему помогает студент " + student.getSurname());
    }
}
