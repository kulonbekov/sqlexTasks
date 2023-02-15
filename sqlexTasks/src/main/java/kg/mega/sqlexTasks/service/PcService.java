package kg.mega.sqlexTasks.service;

import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskPcDto1;

import java.util.List;

public interface PcService {

    List<TaskPcDto1> task1 (double price);

    List<TaskPcDto1> task5(double price, String cd1, String cd2);
    List<TaskDto7> task7(String maker);


}
