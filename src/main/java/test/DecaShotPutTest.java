import decathlon.DecaShotPut;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecaShotPutTest {

    public DecaShotPut decaShotPut;

    @Before
    public void setUp() {
        decaShotPut = new DecaShotPut();
    }

    @Test
    public void test_RimligDistans() {
        // Testa en rimlig distans som är acceptabel
        double validDistance = 10.0;
        decaShotPut.calculateResult(validDistance);
        assertEquals("The result is: " + decaShotPut.score, decaShotPut.score, 1016);
    }

    @Test
    public void test_FörLågDistans() {
        // Testa distansen som är för låg, som inte är godkänt
        double negativeDistance = -5.0;
        decaShotPut.calculateResult(negativeDistance);
        assertEquals("The result is: " + decaShotPut.score, decaShotPut.score, 0);
    }

    @Test
    public void test_FörHögDistans() {
        // Testa distansen som är för hög, som inte är godkänt
        double tooHighDistance = 35.0;
        decaShotPut.calculateResult(tooHighDistance);
        assertEquals("The result is: " + decaShotPut.score, decaShotPut.score, 0);
    }
}