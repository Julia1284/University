package ru.yulialyapushkina.university.entity;

public class Student implements  CommonAction, StudentAction{
    Professor professor;

    @Override
    public void goToUniversity() {
        System.out.println("Студент идет в университет, чтобы учиться");
    }

    @Override
    public void preparingForExam() {
        System.out.println("Студент готовится к экзаменам");
    }
}
