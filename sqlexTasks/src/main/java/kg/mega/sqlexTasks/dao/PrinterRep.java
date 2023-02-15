package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRep extends JpaRepository<Printer, Integer> {

    List<Printer> findByColorEquals(char color);
}
