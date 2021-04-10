package com.todoapp.issuemanagement.service.impl;

import com.todoapp.issuemanagement.dto.IssueDto;
import com.todoapp.issuemanagement.entity.issue;
import com.todoapp.issuemanagement.repository.IssueRepository;
import com.todoapp.issuemanagement.service.IssueService;
import com.todoapp.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.Arrays;

public class IssueServiceImpl implements IssueService {
    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper){
        this.issueRepository = issueRepository ;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate() == null)
            throw new IllegalArgumentException("Issue Date cannot be null!");


        issue IssueDb = modelMapper.map(issue, com.todoapp.issuemanagement.entity.issue.class);

        IssueDb = issueRepository.save(IssueDb);
       return modelMapper.map(IssueDb ,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
       Page<issue> data = issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data,Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(Long issueId) {
        issueRepository.deleteById(issueId);
        return true;
    }

    @Override
    public IssueDto update(Long id, IssueDto project) {
        return null;
    }


}
