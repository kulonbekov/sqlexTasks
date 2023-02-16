package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Pc;
import kg.mega.sqlexTasks.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRep extends JpaRepository<Printer, Integer> {

    List<Printer> findByColorEquals(char color);

    @Query(value = "select distinct * from printers pr join products p on pr.model = p.model where p.maker = :maker", nativeQuery = true)
    List<Printer> findByAll(String maker);

    @Query(value = "select *\n" +
            "From printers p\n" +
            "Where price = (Select Max(price)\n" +
            "               From printers)", nativeQuery = true)
    List<Printer> findByMaxPrice();
}
