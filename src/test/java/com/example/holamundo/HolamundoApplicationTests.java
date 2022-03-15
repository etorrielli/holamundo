package com.example.holamundo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HolamundoApplicationTests {

    @Test
    void contextLoads() {
        String saludo = HolamundoApplication.saludar();
        Assertions.assertTrue(saludo.equals("Hola mundo!"));
    }

}
