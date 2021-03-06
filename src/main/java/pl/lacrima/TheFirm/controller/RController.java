package pl.lacrima.TheFirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lacrima.TheFirm.database.model.Warehouse;
import pl.lacrima.TheFirm.repository.WarehouseRepository;
import pl.lacrima.TheFirm.service.WarehouseService;

import java.util.List;

@RestController
public class RController {

    private final WarehouseService warehouseService;

    @Autowired
    public RController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping(name = "warehouse")
    public List<Warehouse> getAll() {
        return warehouseService.findAll();
    }

    @PostMapping("insert")
    public void ins(@RequestBody Warehouse warehouse) {
        warehouseService.save(warehouse);
    }
}
