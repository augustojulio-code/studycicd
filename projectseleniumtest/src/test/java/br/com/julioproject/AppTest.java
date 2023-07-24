package br.com.julioproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.julioproject.resources.UserController;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private UserController controller = new UserController();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testAbc() {
        try {
            assertEquals("Olá", controller.hello().trim());
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }
}
