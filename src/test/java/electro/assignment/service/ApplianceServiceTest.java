package electro.assignment.service;

import electro.assignment.model.Appliance;
import electro.assignment.model.Customer;
import electro.assignment.repo.ApplianceRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ApplianceServiceTest {

    @MockBean
    ApplianceRepository applianceRepo;

    @Autowired
    ApplianceService applianceService;

    @Test
    public void createTest(){
        Customer customer = new Customer(1l, "name" , "address");
        Appliance appliance = new Appliance("43522", "fnr", customer);
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(appliance);
        appliances.add(appliance);
        when(applianceRepo.findAll()).thenReturn(appliances);
        String applianceId = applianceService.create(appliance);
        Assertions.assertEquals(applianceId, "43522");
    }


}
