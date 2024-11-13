package com.brunus.gerenciadorTarefa.facade;

import com.brunus.gerenciadorTarefa.dto.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskFacade {
    private static final Map<Long, TaskDTO> tasks = new HashMap<>();

    public TaskDTO create(TaskDTO taskDTO){
        Long nextID = tasks.keySet().size() + 1L;
        taskDTO.setId(nextID);
        tasks.put(nextID, taskDTO);
        return taskDTO;
    }

    public TaskDTO update(TaskDTO taskDTO, Long taskID){
        tasks.put(taskID, taskDTO);
        return taskDTO;
    }

    public TaskDTO read(Long taskID){
        return tasks.get(taskID);
    }

    public List<TaskDTO> readAll(){
        return new ArrayList<>(tasks.values());
    }

    public String delete(Long taskID){
        tasks.remove(taskID);
        return "Deleted.";
    }
}