package kg.mega.sqlexTasks.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "printers")
public class Printer {

    @Id
    Integer code;
    @Column(length = 1)
    char  color;
    @Column(length = 10)
    String type;
    double price;
    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
}
