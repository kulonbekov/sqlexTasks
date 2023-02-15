package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRep extends JpaRepository<Laptop, Integer> {
}
