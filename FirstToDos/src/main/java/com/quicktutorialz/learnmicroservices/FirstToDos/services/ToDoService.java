package com.quicktutorialz.learnmicroservices.FirstToDos.services;

import com.quicktutorialz.learnmicroservices.FirstToDos.entities.ToDo;

import java.util.List;

public interface ToDoService {

    List<ToDo> getToDos(String email);

    ToDo addToDo(ToDo toDo);

    void deleteToDo(Integer id);
}
