package com.example.TodoApp.controller;

import com.example.TodoApp.models.Task;
import com.example.TodoApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {

//    @Autowired
//    private TaskService taskService;
//    Constructor injection is preferred over field injection for better testability, immutability, and best practices.

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";
    }

    @PostMapping
    public String setTask(@RequestParam String title){
        taskService.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);
        return "redirect:/";
    }



}
