package ru.yulialyapushkina.university._main;

import ru.yulialyapushkina.university.entity.CommonAction;
import ru.yulialyapushkina.university.entity.Professor;
import ru.yulialyapushkina.university.entity.Student;
import ru.yulialyapushkina.university.service.CommonActionService;
import ru.yulialyapushkina.university.service.ProfessorActionService;
import ru.yulialyapushkina.university.service.StudentActionService;

public class _Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Professor professor1 = new Professor();
        StudentActionService.executeStudentAction(student1);
        ProfessorActionService.executeProfessorAction(professor1);
        CommonActionService.executeCommonAction(student1);
        CommonActionService.executeCommonAction(professor1);
    }
}
