package kg.mega.sqlexTasks.controllers;

import io.swagger.annotations.Api;
import kg.mega.sqlexTasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@Api(tags = "SQL tasks")
@RestController
@RequestMapping("/api/v1/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/run")
    public Object run(@RequestParam int taskNum){
        return taskService.run(taskNum);
    }
}
