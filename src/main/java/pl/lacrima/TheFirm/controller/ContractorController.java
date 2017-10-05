package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.service.ContractorService;

import java.util.List;

@Controller
public class ContractorController {

    public final ContractorService contractorService;

    public ContractorController(ContractorService contractorService) {
        this.contractorService = contractorService;
    }

    @RequestMapping("allcontractors")
    public String retrieveAllContractors(Model model) {
        List<Contractor> list = contractorService.findAllContractors();
        model.addAttribute("ALL_CONTRACTORS", list);
        return "retrieveAllContractors";
    }

    @RequestMapping(value = "newcontractor", method = RequestMethod.POST)
    public String createNewContractor(@ModelAttribute("contractor") Contractor contractor) {
        contractorService.createNewContractor(contractor);
        return "redirect:allcontractors";
    }
}
