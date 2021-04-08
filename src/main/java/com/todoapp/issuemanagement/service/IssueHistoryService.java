package com.todoapp.issuemanagement.service;
import com.todoapp.issuemanagement.entity.IssueHistory;
import com.todoapp.issuemanagement.entity.issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {
    IssueHistory save(IssueHistory issueHistory);
    IssueHistory getById(Long id);
    Page<IssueHistory> getAllPageable(Pageable pageable);
    Boolean delete(IssueHistory issueHistory);

}
