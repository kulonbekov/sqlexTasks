package kg.mega.sqlexTasks.mappers;

import kg.mega.sqlexTasks.models.Printer;
import kg.mega.sqlexTasks.models.dtos.TaskPrinterDto4;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PrinterMapper {

    PrinterMapper INSTANCE = Mappers.getMapper(PrinterMapper.class);
    @Mapping(source = "product.model", target = "model")
    TaskPrinterDto4 printerToTaskPrinterDto4 (Printer printer);
    List<TaskPrinterDto4> printerToTaskPrinterDto4 (List<Printer> printer);
}
