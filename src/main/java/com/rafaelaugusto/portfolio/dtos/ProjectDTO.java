package com.rafaelaugusto.portfolio.dtos;

import com.rafaelaugusto.portfolio.domain.entities.Project;
import com.rafaelaugusto.portfolio.domain.enums.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {

    private String name;
    private String description;
    private String imgUrl;
    private String stacks;
    private ProjectStatus status;
    private String repositoryLink;

    public ProjectDTO(Project entity){
        BeanUtils.copyProperties(entity, this);
    }
}
