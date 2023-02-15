package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.dao.LaptopRep;
import kg.mega.sqlexTasks.mappers.LaptopMapper;
import kg.mega.sqlexTasks.models.Laptop;
import kg.mega.sqlexTasks.models.dtos.TaskDto7;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto3;
import kg.mega.sqlexTasks.models.dtos.TaskLaptopDto6;
import kg.mega.sqlexTasks.service.LaptopService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRep laptopRep;

    public LaptopServiceImpl(LaptopRep laptopRep) {
        this.laptopRep = laptopRep;
    }

    @Override
    public List<TaskLaptopDto3> task3(double price) {
        List<Laptop> laptops = laptopRep.findByPriceGreaterThan(price);
        return LaptopMapper.INSTANCE.laptopToTaskLaptopDtos3(laptops);
    }

    @Override
    public List<TaskLaptopDto6> task6(double hd) {
        List<Laptop> laptops = laptopRep.findAllByHdGreaterThanEqual(hd);
        return LaptopMapper.INSTANCE.laptopToTaskLaptopDtos6(laptops);
    }

    @Override
    public List<TaskDto7> task7(String maker) {
        List<Laptop> laptops = laptopRep.findByAll(maker);
        return LaptopMapper.INSTANCE.laptopToTaskDtos7(laptops);
    }


}
