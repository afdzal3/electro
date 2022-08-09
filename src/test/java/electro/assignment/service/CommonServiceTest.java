package electro.assignment.service;

import electro.assignment.model.Config;
import electro.assignment.repo.ConfigRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CommonServiceTest {

    @MockBean
    ConfigRepository configRepo;

   
    @Autowired
    CommonService commonService;

    @Test
    public Boolean getPopConfigTest(){
        Config conf = configRepo.findById("pop");
        if (conf == null) {
            System.out.println("config need to be set");
            return true;
        } else {
            System.out.println("config need not to be set");
            return false;
        }
    }

}
