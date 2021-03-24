import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void operar() {
        assertEquals(4,2+2);
        assertEquals(32,15+17);
        assertEquals(25,50-25);
        assertEquals(30,45-15);
        assertEquals(16,8*2);
        assertEquals(100,5*20);
        assertEquals(35,70/2);
        assertEquals(5,25/5);

    }
}