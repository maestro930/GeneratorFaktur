package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.database.model.Warehouse;
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

    @RequestMapping(value = "createcontractor", method = RequestMethod.GET)
    public String createContractor() {
        return "newContractor";
    }

    @RequestMapping(value = "newcontractor", method = RequestMethod.POST)
    public String createNewContractor(@ModelAttribute("contractor") Contractor contractor) {
        contractorService.createNewContractor(contractor);
        return "redirect:allcontractors";
    }

    @RequestMapping("deletecontractor")
    public String deleteContractor(@RequestParam("id") Long id) {
        contractorService.deleteContractor(id);
        return "redirect:allcontractors";
    }

    // update
    @RequestMapping(value = "changecontractor", method = RequestMethod.GET)
    public ModelAndView editContractor(@RequestParam("id") Long id) {
        ModelAndView mav = new ModelAndView("updateContractor");    // to updateContractor.jsp
        Contractor contractor = contractorService.findContractorById(id);
        mav.addObject("updateContractorCommand", contractor);
        return mav;
    }

    @RequestMapping(value = "updatecontractor", method = RequestMethod.POST)    // from updateContractor.jsp
    public String updateContractor(@ModelAttribute("updateContractorCommand") Contractor contractor) {
        contractorService.updateContractor(contractor);
        return "redirect:allcontractors";
    }
}
