package com.todoapp.issuemanagement.service;
import com.todoapp.issuemanagement.entity.IssueHistory;
import com.todoapp.issuemanagement.entity.User;
import com.todoapp.issuemanagement.entity.issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface UserService {
   User save(User user);
   User  getById(Long id);
   Page<User> getAllPageable(Pageable pageable);
   User getByUsername(String username);
}
