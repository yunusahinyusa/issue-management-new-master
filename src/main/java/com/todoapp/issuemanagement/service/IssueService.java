package com.todoapp.issuemanagement.service;

import com.todoapp.issuemanagement.dto.IssueDto;
import com.todoapp.issuemanagement.entity.issue;
import com.todoapp.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete(Long issue);
    IssueDto update(Long id,IssueDto project);

}
