package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRep extends JpaRepository<Printer, Integer> {
}
