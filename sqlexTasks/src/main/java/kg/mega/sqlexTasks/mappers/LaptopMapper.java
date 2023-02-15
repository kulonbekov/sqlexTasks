package kg.mega.sqlexTasks.mappers;

import kg.mega.sqlexTasks.models.Laptop;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto3;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LaptopMapper {

    LaptopMapper INSTANCE = Mappers.getMapper(LaptopMapper.class);

    @Mapping(source = "product.model", target = "model")
    TaskLaptopDto3 laptopToTaskLaptopDto3(Laptop laptop);

    List<TaskLaptopDto3> laptopToTaskLaptopDtos3(List<Laptop> laptop);


}
