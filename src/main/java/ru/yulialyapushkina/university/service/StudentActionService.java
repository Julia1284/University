package ru.yulialyapushkina.university.service;

import ru.yulialyapushkina.university.entity.StudentAction;

public class StudentActionService {
    public static void  executeStudentAction (StudentAction studentAction){
        studentAction.preparingForExam();
    }
}
