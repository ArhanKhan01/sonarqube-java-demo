
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

        try (PrintStream testOut = new PrintStream(output)) {
            System.setOut(testOut);
            Main.main(new String[]{});
            assertTrue(output.toString().contains("Arhan"));
        } finally {
            System.setOut(originalOut);
        }
    }
}
