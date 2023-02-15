package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.service.PcService;
import kg.mega.sqlexTasks.service.ProductService;
import kg.mega.sqlexTasks.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final PcService pcService;
    private final ProductService productService;

    public TaskServiceImpl(PcService pcService, ProductService productService) {
        this.pcService = pcService;
        this.productService = productService;
    }

    @Override
    public Object run(int taskNum) {
        switch(taskNum){
            case 1:
                return pcService.task1(500);
            case 2:
                return productService.task2("Printer");
        }
        return null;
    }
}
