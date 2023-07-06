package br.com.julioproject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testAbc() {
        String test = "ok";
        if (test.equalsIgnoreCase("ok")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
