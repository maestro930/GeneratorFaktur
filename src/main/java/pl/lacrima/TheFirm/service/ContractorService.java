package pl.lacrima.TheFirm.service;

import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.repository.ContractorRepository;

import java.util.List;

@Service
public class ContractorService {

    public final ContractorRepository contractorRepository;

    public ContractorService(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }

    public void createNewContractor(Contractor contractor) {
        contractorRepository.save(contractor);
    }

    public List<Contractor> findAllContractors(){
        return contractorRepository.findAll();
    }
}
