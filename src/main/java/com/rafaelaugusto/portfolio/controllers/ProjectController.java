package com.rafaelaugusto.portfolio.controllers;

import com.rafaelaugusto.portfolio.dtos.ProjectDTO;
import com.rafaelaugusto.portfolio.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("/create-project")
    public ResponseEntity create(@RequestBody ProjectDTO request) {
        projectService.create(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("")
    @CrossOrigin(origins = "*")
    public List findAll(){
        return projectService.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity findById(Long id){

        var result = projectService.findById(id);
        return ResponseEntity.ok().body(result);

    }


}
