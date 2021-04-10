package com.todoapp.issuemanagement.dto;

import com.todoapp.issuemanagement.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto  {
    private Long id;
    @NotNull
    private String projectName;
    @NotNull
    private String projectCode;

}
