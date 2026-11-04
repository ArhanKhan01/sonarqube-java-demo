
package com.demo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testMainMethod() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output));
            Main.main(new String[]{});

            String result = output.toString();

            assertTrue(result.contains("Arhan"));
        } finally {
            System.setOut(originalOut);
        }
    }
}
