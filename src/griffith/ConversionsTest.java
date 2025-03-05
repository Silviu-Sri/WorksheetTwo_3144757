package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversionsTest {

    @Test
    public void testEuroToDollar() {
        Conversions conv = new Conversions();
        assertEquals(1.08, conv.euroToDollar(1), 0.01);
        assertEquals(5.40, conv.euroToDollar(5), 0.01);
        assertEquals(0.00, conv.euroToDollar(0), 0.01);
    }
    
    @Test
    public void testDollarToEuro() {
        Conversions conv = new Conversions();
        assertEquals(0.93, conv.dollarToEuro(1), 0.01);
        assertEquals(4.65, conv.dollarToEuro(5), 0.01);
        assertEquals(0.00, conv.dollarToEuro(0), 0.01);
    }
}