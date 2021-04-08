package com.todoapp.issuemanagement.repository;

import com.todoapp.issuemanagement.entity.issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<issue,Long> {

}
