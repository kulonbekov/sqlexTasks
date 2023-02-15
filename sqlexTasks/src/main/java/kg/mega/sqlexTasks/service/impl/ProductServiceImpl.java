package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.dao.ProductRep;
import kg.mega.sqlexTasks.mappers.ProductMapper;
import kg.mega.sqlexTasks.models.Product;
import kg.mega.sqlexTasks.models.dtos.TaskProductDto2;
import kg.mega.sqlexTasks.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRep productRep;

    public ProductServiceImpl(ProductRep productRep) {
        this.productRep = productRep;
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
}
