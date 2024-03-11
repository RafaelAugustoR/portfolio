package com.rafaelaugusto.portfolio.domain.entities;

import com.rafaelaugusto.portfolio.domain.enums.ProjectStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String imgUrl;
    private String stacks;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

}
