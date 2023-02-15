package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRep extends JpaRepository<Pc, Integer> {

    List<Pc> findByPriceLessThan(double price);
}
