package com.example.jplogsBE.ToDo;

import com.example.jplogsBE.Sticky.StickyDTO;

import java.util.List;

public interface ToDoService {

    List<ToDoDTO> getToDos();

    void addToDo(ToDoDTO toDoDTO);

    void editToDo(ToDoDTO toDoDTO);

    void deleteToDo(String uuid);
}