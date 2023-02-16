package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.service.*;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final PcService pcService;
    private final ProductService productService;
    private final LaptopService laptopService;
    private final PrinterService printerService;

    public TaskServiceImpl(PcService pcService, ProductService productService, LaptopService laptopService, PrinterService printerService) {
        this.pcService = pcService;
        this.productService = productService;
        this.laptopService = laptopService;
        this.printerService = printerService;
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
            case 4:
                return printerService.task4('y');
            case 5:
                return pcService.task5(600, "12x","24x");
            case 6:
                return laptopService.task6(10);
            case 7:
                return productService.task7("B");
            case 8:
                return productService.task8("PC","Laptop");
            case 9:
                return pcService.task9(450);
            case 10:
                return printerService.task10();
        }
        return null;
    }
}
