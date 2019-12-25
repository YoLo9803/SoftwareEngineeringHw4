package com.test;

import com.company.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() throws IOException {
        String data = "80";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Main.main(new String[0]);
        Main.main(new String[0]);
    }
}