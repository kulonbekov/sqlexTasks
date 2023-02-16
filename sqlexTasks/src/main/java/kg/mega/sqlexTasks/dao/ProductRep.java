package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Product;
import kg.mega.sqlexTasks.models.dtos.TaskProductDto20;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRep extends JpaRepository<Product, String> {

    @Query (value = "select * from products p where p.type = :type", nativeQuery = true)
    List<Product> findByType(String type);
    @Query(value = "select maker, count(model) as Count_Model from products p where type = :type group by maker having count(model)>=3", nativeQuery = true)
    List<TaskProductDto20> findByAll20(String type);
}
