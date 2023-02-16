package kg.mega.sqlexTasks.dao;

import kg.mega.sqlexTasks.models.Laptop;
import kg.mega.sqlexTasks.models.Pc;
import kg.mega.sqlexTasks.models.dtos.TaskPcDto15;
import kg.mega.sqlexTasks.models.dtos.TaskPcDto16;
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
   // @Query(value = "select distinct * from products p inner join pcs pc on p.model = pc.model where pc.speed >=:speed", nativeQuery = true)
    List<Pc> findDistinctBySpeedGreaterThan (int speed);
    @Query(value = "select avg(p.speed) from pcs p", nativeQuery = true)
    Integer findByAvgSpeed();

    @Query(value = "select avg(p.speed) from pcs p join products pr on p.model = pr.model Where pr.maker = :maker", nativeQuery = true)
    int findAllBySpeedAvgAndMaker(String maker);

    @Query(value = "select distinct p.hd from pcs p group by p.hd  having count(*) > 1 order by hd", nativeQuery = true)
    List<TaskPcDto15> findAllByHd();

    @Query(value = "select distinct pcs.model as model1, pc2.model as model2, pcs.speed, pcs.ram " +
            "from pcs inner join pcs pc2 on pcs.speed = pc2.speed " +
            "join products p on pcs.model = p.model " +
            "Where pcs.ram = pc2.ram and pcs.model > pc2.model", nativeQuery = true)
    List<TaskPcDto16> findAllByTask16();

    @Query("select min(speed) from Pc")
    int findBy17 ();
}
