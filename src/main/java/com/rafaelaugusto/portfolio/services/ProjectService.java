package com.rafaelaugusto.portfolio.services;

import com.rafaelaugusto.portfolio.domain.entities.Project;
import com.rafaelaugusto.portfolio.domain.enums.ProjectStatus;
import com.rafaelaugusto.portfolio.dtos.ProjectDTO;
import com.rafaelaugusto.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void create(ProjectDTO request){

        Project entityToSave = Project.builder()
                .name(request.getName())
                .description(request.getDescription())
                .stacks(request.getStacks())
                .imgUrl(request.getImgUrl())
                .status(request.getStatus())
                .repositoryLink(request.getRepositoryLink())
                .build();


        projectRepository.save(entityToSave);

    }

    public List<ProjectDTO> findAll(){
        List<Project> projectList = projectRepository.findAll();
        return projectList.stream().map(ProjectDTO::new).toList();
    }

    public ProjectDTO findById(Long id){

        Project result = projectRepository.findById(id).get();
        return new ProjectDTO(result);

    }

}
