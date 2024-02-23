package ru.yulialyapushkina.university.service;

import ru.yulialyapushkina.university.entity.CommonAction;

public class CommonActionService {
    public static  void executeCommonAction (CommonAction commonAction){
       commonAction.goToUniversity();
    }
}
