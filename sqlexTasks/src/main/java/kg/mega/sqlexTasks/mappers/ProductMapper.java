package kg.mega.sqlexTasks.mappers;

import kg.mega.sqlexTasks.models.Product;
import kg.mega.sqlexTasks.models.dtos.TaskProductDto2;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    TaskProductDto2 productToTaskProductDto2 (Product product);
    List<TaskProductDto2> productToTaskProductDtos2 (List<Product> product);
}
