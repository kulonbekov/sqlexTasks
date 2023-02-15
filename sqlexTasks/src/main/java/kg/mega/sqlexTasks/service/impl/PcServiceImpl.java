package kg.mega.sqlexTasks.service.impl;

import kg.mega.sqlexTasks.dao.PcRep;
import kg.mega.sqlexTasks.mappers.PcMapper;
import kg.mega.sqlexTasks.models.Pc;
import kg.mega.sqlexTasks.models.dtos.TaskPcDto1;
import kg.mega.sqlexTasks.service.PcService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    private final PcRep pcRep;


    public PcServiceImpl(PcRep pcRep) {
        this.pcRep = pcRep;
    }

    @Override
    public List<TaskPcDto1> task1(double price) { // service for the 1 task (sql-ex)
        List<Pc> pcs = pcRep.findByPriceLessThan(price);
        return PcMapper.INSTANCE.pcToTaskPcDtos1(pcs);
    }

    @Override
    public List<TaskPcDto1> task5(double price, String cd1, String cd2) { // service for the 5 task (sql-ex)
        List<Pc> pcs = pcRep.findAllBy(price,cd1,cd2);
        return PcMapper.INSTANCE.pcToTaskPcDtos1(pcs);
    }
}
