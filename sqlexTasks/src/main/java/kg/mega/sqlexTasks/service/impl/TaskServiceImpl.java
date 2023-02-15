package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.service.LaptopService;
import kg.mega.sqlexTasks.service.PcService;
import kg.mega.sqlexTasks.service.ProductService;
import kg.mega.sqlexTasks.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final PcService pcService;
    private final ProductService productService;
    private final LaptopService laptopService;

    public TaskServiceImpl(PcService pcService, ProductService productService, LaptopService laptopService) {
        this.pcService = pcService;
        this.productService = productService;
        this.laptopService = laptopService;
    }

    @Override
    public Object run(int taskNum) {
        switch(taskNum){
            case 1:
                return pcService.task1(500);
            case 2:
                return productService.task2("Printer");
            case 3:
                return laptopService.task3(1000);
        }
        return null;
    }
}
