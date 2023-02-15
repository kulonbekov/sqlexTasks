package kg.mega.sqlexTasks.models.dtos;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskLaptopDto3 {
    String model;
    int ram;
    int screen;
}
