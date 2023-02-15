package kg.mega.sqlexTasks.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "pcs")
public class Pc {

    @Id
    Integer code;
    int speed;
    int ram;
    double hd;
    @Column(length = 10)
    String cd;
    double price;
    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
}
