package com.webservice.board;

import com.webservice.board.web.BasicController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = BasicController.class)
public class BasicControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void checkBasic() throws Exception {
        String basic = "basic";

        mvc.perform(get("/basic"))
                .andExpect(status().isOk())
                .andExpect(content().string(basic));
    }
}
