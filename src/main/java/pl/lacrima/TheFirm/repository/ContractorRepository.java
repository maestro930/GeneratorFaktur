package pl.lacrima.TheFirm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.lacrima.TheFirm.database.model.Contractor;

import java.util.List;

@Repository
public interface ContractorRepository extends JpaRepository<Contractor, Long> {

    @Query("select contractorName from Contractor ")
    List<Contractor> findAllByContractorName(String contractorName);

    List<Contractor> findByCity(String city);

    List<Contractor> findContractorByNip (String nip);

    List<Contractor> findContractorByContractorName(String contractorName);

}
