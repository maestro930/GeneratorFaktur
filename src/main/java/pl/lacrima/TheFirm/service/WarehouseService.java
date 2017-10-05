package pl.lacrima.TheFirm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.Warehouse;
import pl.lacrima.TheFirm.repository.WarehouseRepository;

import java.util.List;

@Service
public class WarehouseService {

    public final WarehouseRepository warehouseRepository;

    @Autowired
    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    //@PostConstruct
    void insert() {
        Warehouse wh = new Warehouse("Bateria", 4D, "szt", 2L);
        warehouseRepository.save(wh);
        warehouseRepository.save(new Warehouse("Latarka", 31D, "szt", 14L));
    }

//    @Autowired
    public List<Warehouse> findAll() {
        return warehouseRepository.findAll();
    }
    public void save(Warehouse warehouse){
        warehouseRepository.save(warehouse);
    }
}