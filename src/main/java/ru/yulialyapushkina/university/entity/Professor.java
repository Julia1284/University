package ru.yulialyapushkina.university.entity;

public class Professor implements CommonAction, ProfessorAction{
    Student student;

    @Override
    public void goToUniversity() {
        System.out.println("Профессор идет в университет, чтобы учить");
    }

    @Override
    public void writingDissertation() {
        System.out.println("Профессор пишет диссертацию");
    }
}
