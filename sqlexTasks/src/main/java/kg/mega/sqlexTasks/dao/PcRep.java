package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Laptop;
import kg.mega.sqlexTasks.models.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRep extends JpaRepository<Pc, Integer> {

    List<Pc> findByPriceLessThan(double price);

    @Query(value = "select * from pcs p where (p.cd = :cd1 or p.cd = :cd2) and p.price < :price",nativeQuery = true)
    List<Pc> findAllBy (double price, String cd1, String cd2);

    @Query(value = "select distinct * from pcs pc join products p on pc.model = p.model where p.maker = :maker", nativeQuery = true)
    List<Pc> findByAll(String maker);
}
