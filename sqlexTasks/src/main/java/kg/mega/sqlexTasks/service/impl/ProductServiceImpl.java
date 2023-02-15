package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.dao.ProductRep;
import kg.mega.sqlexTasks.mappers.ProductMapper;
import kg.mega.sqlexTasks.models.Product;
import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskProductDto2;
import kg.mega.sqlexTasks.service.LaptopService;
import kg.mega.sqlexTasks.service.PcService;
import kg.mega.sqlexTasks.service.PrinterService;
import kg.mega.sqlexTasks.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRep productRep;
    private final PrinterService printerService;
    private final PcService pcService;
    private final LaptopService laptopService;

    public ProductServiceImpl(ProductRep productRep, PrinterService printerService, PcService pcService, LaptopService laptopService) {
        this.productRep = productRep;
        this.printerService = printerService;
        this.pcService = pcService;
        this.laptopService = laptopService;
    }

    @Override
    public List<TaskProductDto2> task2(String type) { // service for the 2 task (sql-ex)
        List<Product> products = productRep.findByType(type);
        List<TaskProductDto2> newList = ProductMapper.INSTANCE.productToTaskProductDtos2(products)
                .stream()
                .distinct()
                .collect(Collectors.toList());
        return newList;
    }

    @Override
    public List<TaskDto7> task7(String maker) { // service for the 7 task (sql-ex)
        List<TaskDto7> taskDto7s = new ArrayList<>();
        taskDto7s.addAll(pcService.task7(maker));
        taskDto7s.addAll(laptopService.task7(maker));
        taskDto7s.addAll(printerService.task7(maker));
        return taskDto7s.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> task8(String type1, String type2) { // service for the 8 task (sql-ex)
        List<Product> productsPC = productRep.findByType(type1);
        List<Product> productsLaptop = productRep.findByType(type2);

        productsPC = productsPC.stream()
                .filter(x->{
                    for (Product product: productsLaptop) {
                        if (product.getMaker().equals(x.getMaker()))
                            return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());

        return productsPC.stream().map(x->x.getMaker()).distinct().collect(Collectors.toList());
    }


}
