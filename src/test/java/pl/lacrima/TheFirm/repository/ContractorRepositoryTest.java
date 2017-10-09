package pl.lacrima.TheFirm.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.database.model.Invoice;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.doesNotHave;
import static org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace.NONE;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = NONE)
public class ContractorRepositoryTest {

@Autowired
 private ContractorRepository contractorRepository;

    @Before
    public void setUp() {

        List<Invoice> invList = new ArrayList<>();
        contractorRepository.save(new Contractor("A spolka zoo", "1321324", "contractorska 6", "warszawa", "01-121", "323424332","dda@dd.pl",invList ));
        contractorRepository.save(new Contractor("A spolka zoo", "1343224", "contractorska 7", "warszawa", "02-121", "324124332","ddb@dd.pl",invList ));
        contractorRepository.save(new Contractor("A spolka zoo", "1378924", "contractorska 8", "warszawa", "03-121", "456324332","ddc@dd.pl",invList ));
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
