package kg.mega.sqlexTasks.service;

import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskPrinterDto4;

import java.util.List;

public interface PrinterService {

    List<TaskPrinterDto4> task4(char color);
    List<TaskDto7> task7(String maker);
}
