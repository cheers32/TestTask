package com.techprimers.mybatis.springbootmybatis.model;

import com.techprimers.mybatis.springbootmybatis.domain.Task;

import java.util.List;

public interface TaskRepo {
    List<Task> getRepo();

    void setRepo(List<Task> repo);
}
