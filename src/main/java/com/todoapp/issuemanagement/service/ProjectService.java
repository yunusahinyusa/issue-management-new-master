package com.todoapp.issuemanagement.service;
import com.todoapp.issuemanagement.dto.ProjectDto;
import com.todoapp.issuemanagement.entity.IssueHistory;
import com.todoapp.issuemanagement.entity.Project;
import com.todoapp.issuemanagement.entity.User;
import com.todoapp.issuemanagement.entity.issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    Project save(Project project);
    ProjectDto getById(Long id);
    List<Project> getByProjectCode(String projectCode);
    List<Project> getByProjectCodeContains(String projectCode);
    Page<Project> getAllPageable(Pageable pageable);
    Boolean delete(Project project);
}
