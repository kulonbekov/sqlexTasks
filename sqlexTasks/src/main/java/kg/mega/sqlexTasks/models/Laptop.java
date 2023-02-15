package kg.mega.sqlexTasks.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    Integer code;
    int speed;
    int ram;
    double hd;
    int screen;
    double price;
    @ManyToOne
    @JoinColumn(name = "model")
    Product product;

}
