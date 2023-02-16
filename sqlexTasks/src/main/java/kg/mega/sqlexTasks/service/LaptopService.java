package kg.mega.sqlexTasks.service;

import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto3;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto6;

import java.util.List;

public interface LaptopService {

    List<TaskLaptopDto3> task3 (double price);
    List<TaskLaptopDto6> task6(double hd);
    List<TaskDto7> task7 (String maker);

    Integer task12(double price);


}
