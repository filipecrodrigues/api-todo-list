package com.todoapi.todoAPI.controlller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    //listar tarefas
    private List<String> tasks = new ArrayList<>();

    private ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

   //Listagem das tarefas
    @GetMapping (path = "/tasks" ) //caminho Api
    //metodo para reposnder na rota
    public ResponseEntity<String> listTask () throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
    }
    //Criação das tarefas
    @PostMapping(path = "/tasks")
    public ResponseEntity<Void> createTask(@RequestBody String task){ //Mapear um atributo denro do corpo da requisição

        tasks.add(task);

        return ResponseEntity.ok().build();

    }
    //Limpeza das tarefas
    @DeleteMapping(path ="/tasks")

    public ResponseEntity<Void> clearTask(){
        tasks = new ArrayList<>();
        return ResponseEntity.ok().build();
    }
}
