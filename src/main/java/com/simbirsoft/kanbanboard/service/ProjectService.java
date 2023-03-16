package com.simbirsoft.kanbanboard.service;


import com.simbirsoft.kanbanboard.model.Project;
import com.simbirsoft.kanbanboard.repository.ProjectRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

  private final ProjectRepository projectRepository;

  public ProjectService(ProjectRepository projectRepository) {
    this.projectRepository = projectRepository;
  }

  public List<Project> getAllProjects() {
    return projectRepository.findAll();
  }

  public Optional<Project> getProjectById(Long id) {
    return projectRepository.findById(id);
  }

  public Project saveProject(Project project) {
    return projectRepository.save(project);
  }

  public void deleteProjectById(Long id) {
    projectRepository.deleteById(id);
  }
}