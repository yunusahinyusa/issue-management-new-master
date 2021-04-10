package com.todoapp.issuemanagement.service;
import com.todoapp.issuemanagement.dto.ProjectDto;
import com.todoapp.issuemanagement.entity.IssueHistory;
import com.todoapp.issuemanagement.entity.Project;
import com.todoapp.issuemanagement.entity.User;
import com.todoapp.issuemanagement.entity.issue;
import com.todoapp.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    ProjectDto save(ProjectDto project);
    ProjectDto getById(Long id);
    ProjectDto getByProjectCode(String projectCode);
    List<ProjectDto> getByProjectCodeContains(String projectCode);
    TPage<ProjectDto> getAllPageable(Pageable pageable);
    Boolean delete(ProjectDto project);

    ProjectDto update(Long id, ProjectDto project);
}
