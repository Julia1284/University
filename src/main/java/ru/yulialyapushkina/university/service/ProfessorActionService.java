package ru.yulialyapushkina.university.service;

import ru.yulialyapushkina.university.entity.ProfessorAction;

public class ProfessorActionService {
    public static void executeProfessorAction (ProfessorAction professorAction){
        professorAction.writingDissertation();
    }
}
