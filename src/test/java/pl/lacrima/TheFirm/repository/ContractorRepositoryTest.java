package pl.lacrima.TheFirm.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.lacrima.TheFirm.database.model.Contractor;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace.NONE;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = NONE)
public class ContractorRepositoryTest {

@Autowired
 private ContractorRepository contractorRepository;

    @Before
    public void setUp() {

        contractorRepository.save(new Contractor("A spolka zoo", "1321324", "contractorska 6", "warszawa", "02-121", "324324332", "mail@mail.pl"  ));
        contractorRepository.save(new Contractor("B spolka zoo", "213224", "bontractorska 16", "krakow", "01-111", "764324322", "mail@mail.pl"  ));
        contractorRepository.save(new Contractor("C spolka zoo", "51324", "kontractorska 645", "warszawa", "06-551", "664324232", "mail@mail.pl"  ));
    }


    @Test
    public void findAllByConstructorNameTest(){
        //when
        List<Contractor> contractors = contractorRepository.findContractorByContractorName("A spolka zoo");

        //then
        assertThat(contractors).isNotEmpty();
        assertThat(contractors).size().isGreaterThan(1);

    }

    @Test
    public void findByCityTest(){
        //when
        List<Contractor> contractors = contractorRepository.findByCity("warszawa");
        assertThat(contractors).isNotEmpty();
        assertThat(contractors).size().isGreaterThan(1);
    }

//    @Test
//    public void findContractorByNipTest(){
//       List<Contractor> contractor = contractorRepository.findContractorByNip("1321324");
//    }
}
