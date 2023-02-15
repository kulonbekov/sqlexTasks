package kg.mega.sqlexTasks.models.dtos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskDto {

    String model;
    int speed;
    double hd;

}
