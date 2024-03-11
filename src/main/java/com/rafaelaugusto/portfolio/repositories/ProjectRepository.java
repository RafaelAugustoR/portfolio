package com.rafaelaugusto.portfolio.repositories;

import com.rafaelaugusto.portfolio.domain.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository  extends JpaRepository<Project, Long> {

}
