package com.techprimers.mybatis.springbootmybatis.service;

import com.techprimers.mybatis.springbootmybatis.model.mapper.TaskMapper;
import com.techprimers.mybatis.springbootmybatis.domain.Task;
import com.techprimers.mybatis.springbootmybatis.model.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskMapper taskMapper;
    private TaskRepo taskRepo;

    @Autowired
    public void setTaskRepo(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Autowired
    public void setTaskMapper(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public List<Task> getAllTasks() {
        if(taskRepo.getRepo()==null) {
            List<Task> res = taskMapper.findAll();
            taskRepo.setRepo(res);
        }
        return taskRepo.getRepo();
    }
}
