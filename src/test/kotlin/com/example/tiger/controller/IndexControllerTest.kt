package com.example.tiger.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(IndexController::class)
class IndexControllerTest {

    @Autowired
    lateinit var mvc: MockMvc

    @Test
    fun index() {
        mvc.perform(get("/"))
                .andExpect(status().isOk)
                .andExpect(content().string("{\"Name\":\"Hello World\"}"))
                .andDo { print(it) }
    }

}