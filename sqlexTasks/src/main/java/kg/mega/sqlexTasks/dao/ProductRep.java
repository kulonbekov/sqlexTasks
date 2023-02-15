package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRep extends JpaRepository<Product, String> {
}
