package com.techprimers.mybatis.springbootmybatis.controller;

import com.techprimers.mybatis.springbootmybatis.domain.Task;
import com.techprimers.mybatis.springbootmybatis.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    //public UsersResource(TaskMapper usersMapper) {
//        this.usersMapper = usersMapper;
//    }


    @RequestMapping("/rest/users/all")
    //@GetMapping("/all")
    public List<Task> getAll() {
        return taskService.getAllTasks();
    }

    @RequestMapping("/rest/users/update")
    private List<Task> update() {

        Task task = new Task();
        task.setName("Youtube");
        task.setStatus("No Plan");

        //taskService.insert(task);

        return taskService.getAllTasks();
    }
}
