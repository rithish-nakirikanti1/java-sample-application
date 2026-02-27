package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreet() {
        String result = App.greet("Rithish");
        assertEquals("Hello, Rithish2! hema", result);
    }
}
