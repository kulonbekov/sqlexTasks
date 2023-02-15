package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.service.PcService;
import kg.mega.sqlexTasks.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final PcService pcService;

    public TaskServiceImpl(PcService pcService) {
        this.pcService = pcService;
    }

    @Override
    public Object run(int taskNum) {
        switch(taskNum){
            case 1:
                return pcService.task1(500);
        }
        return null;
    }
}
