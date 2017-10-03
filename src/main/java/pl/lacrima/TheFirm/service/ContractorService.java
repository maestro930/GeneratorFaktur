package pl.lacrima.TheFirm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.repository.ContractorRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ContractorService {
private final ContractorRepository contractorRepository;

    @Autowired
    public ContractorService(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }
//    @PostConstruct
//    void init() {//its just a joke here - dont worry - be happy!)
//
//        contractorRepository.save(new Contractor("A spolka zoo", "1321324", "contractorska 6", "warszawa", "02-121", 32432432, "mail@mail.pl"  ));
//        contractorRepository.save(new Contractor("B spolka zoo", "213224", "bontractorska 16", "krakow", "01-111", 76432432, "mail@mail.pl"  ));
//        contractorRepository.save(new Contractor("C spolka zoo", "51324", "kontractorska 645", "lodzkurwa", "06-551", 66432432, "mail@mail.pl"  ));
//        }


        public void save(Contractor contractor){
        contractorRepository.save(contractor);
        }


    public Contractor createContractor(Contractor contractor) {
        return contractorRepository.save(contractor);
    }

    public List<Contractor> findAll() {
        return contractorRepository.findAll();
    }

    public Contractor findOne(long id) {
        return contractorRepository.findOne(id);
    }




}
