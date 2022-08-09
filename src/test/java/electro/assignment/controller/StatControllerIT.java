package electro.assignment.controller;

import electro.assignment.model.Appliance;
import electro.assignment.model.Customer;
import electro.assignment.model.Log;
import electro.assignment.repo.ApplianceRepository;
import electro.assignment.repo.LogRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class StatControllerIT {
    @MockBean
    ApplianceRepository applianceRepo;

    @MockBean
    LogRepository logRepo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetApps() throws Exception {
        Customer customer = new Customer(1l, "name" , "address");
        Appliance appliance = new Appliance("43522", "fnr", customer);
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(appliance);
        appliances.add(appliance);
        when(applianceRepo.findAll()).thenReturn(appliances);
        mockMvc.perform(get("/api/status/list")).andExpect(status().isOk());
    }

    @Test
    public void testUpdStatus() throws Exception {
        String aid = "123";
        String stat = "stat";
        Customer customer = new Customer(1l, "name" , "address");
        Appliance appliance = new Appliance("123", "fnr", customer);
        Log log = new Log(appliance, stat);
        when(applianceRepo.findById(aid)).thenReturn(appliance);
        when(logRepo.save(log)).thenReturn(log);
        mockMvc.perform(get("/api/status/upd/" + aid  + "/" + stat)).andExpect(status().isOk());
    }



}
