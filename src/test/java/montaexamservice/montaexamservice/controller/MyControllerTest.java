package montaexamservice.montaexamservice.controller;

import montaexamservice.montaexamservice.service.ExamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith({MockitoExtension.class})
class MyControllerTest {

    @Mock
    ExamService service;

    @InjectMocks
    MyController controller;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void getTest() throws Exception {

        mockMvc.perform(
                get("/exams")
        ).andExpect(
                status().isOk()
        ).andExpect(
                content().contentType(MediaType.APPLICATION_JSON)
        );

        Mockito.verify(service).numberOfExamPerUser();
    }
}