package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Laptop;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto17;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto19;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRep extends JpaRepository<Laptop, Integer> {

    List<Laptop> findByPriceGreaterThan(double price);

    List<Laptop> findAllByHdGreaterThanEqual(double hd);

    @Query(value = "select distinct * from laptops l join products p on l.model = p.model where p.maker = :maker", nativeQuery = true)
    List<Laptop> findByAll(String maker);

    @Query("select avg(l.speed) from Laptop l where l.price > :price")
    int findAllByPrice(double price);

    @Query(value = "select p.type, p.model, l.speed " +
            "from products p join laptops l on p.model = l.model " +
            "where l.speed < :speed", nativeQuery = true)
    List<TaskLaptopDto17> findAllBy17(int speed);

    @Query(value = "Select p.maker, avg(l.screen) as Avg_Screen from laptops l inner join products p on l.model = p.model Group by p.maker", nativeQuery = true)
    List<TaskLaptopDto19> findByAll19();
}
