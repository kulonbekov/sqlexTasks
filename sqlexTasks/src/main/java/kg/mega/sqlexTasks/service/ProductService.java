package kg.mega.sqlexTasks.service;

import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto17;
import kg.mega.sqlexTasks.models.dtos.TaskProductDto2;
import kg.mega.sqlexTasks.models.dtos.TaskProductDto20;

import java.util.List;

public interface ProductService {

    List<TaskProductDto2> task2 (String type);
    List<TaskDto7> task7(String maker);
    List<String> task8(String type1, String type2);
    List<TaskLaptopDto17> task17();

    List<TaskProductDto20> task20(String type);
}
