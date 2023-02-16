package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.dao.PrinterRep;
import kg.mega.sqlexTasks.dao.ProductRep;
import kg.mega.sqlexTasks.mappers.PrinterMapper;
import kg.mega.sqlexTasks.models.Printer;
import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskPrinterDto10;
import kg.mega.sqlexTasks.models.dtos.TaskPrinterDto4;
import kg.mega.sqlexTasks.service.PrinterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterServiceImpl implements PrinterService {

    private final PrinterRep printerRep;
    private final ProductRep productRep;

    public PrinterServiceImpl(PrinterRep printerRep,
                              ProductRep productRep) {
        this.printerRep = printerRep;
        this.productRep = productRep;
    }

    @Override
    public List<TaskPrinterDto4> task4(char color) {
        List<Printer> printers = printerRep.findByColorEquals(color);
        return PrinterMapper.INSTANCE.printerToTaskPrinterDto4(printers);
    }

    @Override
    public List<TaskDto7> task7(String maker) {
        List<Printer> printers = printerRep.findByAll(maker);
        return PrinterMapper.INSTANCE.printerToTaskDto7(printers);
    }

    @Override
    public List<TaskPrinterDto10> task10() {
        List<Printer> printers = printerRep.findByMaxPrice();
        return PrinterMapper.INSTANCE.printerToTaskPrinterDtos10(printers);
    }
}
