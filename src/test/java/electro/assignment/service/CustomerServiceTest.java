package electro.assignment.service;

import electro.assignment.model.Customer;
import electro.assignment.repo.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CustomerServiceTest {

    @MockBean
    CustomerRepository customerRepo;

    @Autowired
    CustomerService customerService;

    @Test
    public void createTest(){
        Customer customer = new Customer(1l, "name" , "address");
        when(customerRepo.save(customer)).thenReturn(customer);
        Long id = customerService.create(customer);
        Assertions.assertEquals(id, 1l);
    }

}
