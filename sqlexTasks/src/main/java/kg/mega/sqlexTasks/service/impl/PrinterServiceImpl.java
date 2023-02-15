package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.dao.PrinterRep;
import kg.mega.sqlexTasks.mappers.PrinterMapper;
import kg.mega.sqlexTasks.models.Printer;
import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskPrinterDto4;
import kg.mega.sqlexTasks.service.PrinterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterServiceImpl implements PrinterService {

    private final PrinterRep printerRep;

    public PrinterServiceImpl(PrinterRep printerRep) {
        this.printerRep = printerRep;
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
}
