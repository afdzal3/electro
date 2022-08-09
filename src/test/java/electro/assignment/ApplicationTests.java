package electro.assignment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
//this test call somehow is not reached. attempt to test directly from main test class.
//can delete this class if succeeded.
@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.
                webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void testAppliance() throws Exception {
        mockMvc.perform(get("/api/status/list")).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));

    }

}
