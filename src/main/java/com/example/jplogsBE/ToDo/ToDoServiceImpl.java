package com.example.jplogsBE.ToDo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    ToDoRepository toDoRepository;


    @Override
    public void addToDo(ToDoDTO toDoDTO) {
        toDoRepository.save(new ToDoJpa(toDoDTO.getUuid(),
                toDoDTO.getName(),
                toDoDTO.getTime(),
                toDoDTO.getPriority()
        ));
    }

    @Override
    public void editToDo(ToDoDTO toDoDTO) {
        toDoRepository.findAll().forEach(toDoJpa -> {
            if (toDoDTO.getUuid().equals(toDoJpa.getUuid())) {
                toDoJpa.setName(toDoDTO.getName());
                toDoJpa.setTime(toDoDTO.getTime());
                toDoJpa.setPriority(toDoDTO.getPriority());
                toDoRepository.save(toDoJpa);
            }
        });
    }

    @Override
    public List<ToDoDTO> getToDos() {
        List<ToDoDTO> toDoDTOS = new ArrayList<>();
        toDoRepository.findAll().forEach(toDoJpa -> toDoDTOS.add(
                new ToDoDTO(
                        toDoJpa.getUuid(),
                        toDoJpa.getName(),
                        toDoJpa.getTime(),
                        toDoJpa.getPriority()
                )));
        return toDoDTOS;
    }

    @Override
    public void deleteToDo(String uuid) {
        toDoRepository.findAll().forEach(toDoJpa -> {
            if (toDoJpa.getUuid().equals(uuid)) {
                toDoRepository.delete(toDoJpa);
            }
        });
    }
}
