package com.github.yshameer.spring.activemq.publish.service.api;

import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.springframework.http.MediaType.TEXT_PLAIN;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PublishMessageApiController.class)
public class PublishMessageApiControllerTest {

    @MockBean
    ProducerTemplate producerTemplate;

    @Autowired
    private MockMvc mvc;

    @Test
    public void testPublishMessage() throws Exception {
        mvc.perform(put("/publishMessage")
                .header("queueName", "Test")
                .content("Test Message")
                .contentType(TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"));

        verify(producerTemplate).sendBody(anyString(), anyString());
    }

}