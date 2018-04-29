package com.example.jplogsBE.ToDo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;





@Slf4j
@RestController
@RequestMapping("/todos")
public class ToDoResource {

    @Autowired
    private ToDoService toDoService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/getToDos", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<ToDoDTO> getStickies(){
        return toDoService.getToDos();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/secure/addToDo", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addSticky(@RequestBody ToDoDTO toDoDTO ){
        toDoService.addToDo(toDoDTO);
        return "successful";
    }

    @RequestMapping(value = "/secure/editToDo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String editSticky(@RequestBody ToDoDTO toDoDTO ){
        toDoService.editToDo(toDoDTO);
        return "successful";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/secure/deleteToDo/{uuid}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteSticky(@PathVariable String uuid ){
        toDoService.deleteToDo(uuid);
        return "successful";
    }

}
