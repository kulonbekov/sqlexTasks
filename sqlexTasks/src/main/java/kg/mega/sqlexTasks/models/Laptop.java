package kg.mega.sqlexTasks.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
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
