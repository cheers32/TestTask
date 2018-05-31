package com.techprimers.mybatis.springbootmybatis.model;

import com.techprimers.mybatis.springbootmybatis.domain.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepoImpl implements TaskRepo {
    @Override
    public List<Task> getRepo() {
        return repo;
    }

    @Override
    public void setRepo(List<Task> repo) {
        this.repo = repo;
    }

    private List<Task> repo;
}
