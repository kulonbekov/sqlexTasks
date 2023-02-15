package kg.mega.sqlexTasks.mappers;

import kg.mega.sqlexTasks.models.Pc;
import kg.mega.sqlexTasks.models.Product;
import kg.mega.sqlexTasks.models.dtos.TaskPcDto1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PcMapper {

    PcMapper INSTANCE = Mappers.getMapper(PcMapper.class);

    @Mapping(source = "product.model", target = "model")
    TaskPcDto1 pcToTaskPcDto1(Pc pc);

    List<TaskPcDto1> pcToTaskPcDtos1 (List<Pc> pc);

}
