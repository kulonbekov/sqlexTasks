package kg.mega.sqlexTasks.service;

import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskProductDto2;

import java.util.List;

public interface ProductService {

    List<TaskProductDto2> task2 (String type);
    List<TaskDto7> task7(String maker);
}
