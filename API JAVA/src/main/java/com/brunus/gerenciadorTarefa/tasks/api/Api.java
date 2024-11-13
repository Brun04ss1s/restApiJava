package com.brunus.gerenciadorTarefa.tasks.api;

import com.brunus.gerenciadorTarefa.dto.TaskDTO;
import com.brunus.gerenciadorTarefa.facade.TaskFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
public class Api {
    @Autowired
    private TaskFacade taskFacade;

    @PostMapping
    @ResponseBody
    public TaskDTO create(@RequestBody  TaskDTO taskDTO){
        return taskFacade.create(taskDTO);
    }

    @PutMapping("/{tasksID}")
    @ResponseBody
    public TaskDTO update(@RequestBody TaskDTO taskDTO, @PathVariable("tasksID") Long taskID){
        taskDTO.setId(taskID);
        return taskFacade.update(taskDTO, taskID);
    }

    @GetMapping
    @ResponseBody
    public List<TaskDTO> readAll(){
        return taskFacade.readAll();
    }

    @DeleteMapping("/{tasksID}")
    @ResponseBody
    public String delete(@PathVariable("tasksID") Long taskID){
        return taskFacade.delete(taskID);
    }
}
