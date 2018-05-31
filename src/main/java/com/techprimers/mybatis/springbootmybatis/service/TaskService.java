package com.techprimers.mybatis.springbootmybatis.service;

import com.techprimers.mybatis.springbootmybatis.domain.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
}
