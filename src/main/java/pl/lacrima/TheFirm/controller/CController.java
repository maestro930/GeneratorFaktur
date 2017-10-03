package pl.lacrima.TheFirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.service.ContractorService;

import java.util.List;
@RestController
public class CController {

//    private final ContractorService contractorService;
//
//    @Autowired
//    public CController(ContractorService contractorService) {
//        this.contractorService = contractorService;
//    }
//
//    @GetMapping(name = "contr")
//    public List<Contractor> getAll() {
//        return contractorService.findAll();
//    }
//
//    @PostMapping("insert2")
//    public void ins(@RequestBody Contractor contractor) {
//        contractorService.save(contractor);
//    }
}
