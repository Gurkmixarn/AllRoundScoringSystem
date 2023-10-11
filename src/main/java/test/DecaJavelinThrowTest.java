import decathlon.DecaJavelinThrow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecaJavelinThrowTest {

    private DecaJavelinThrow decaJavelinThrow;

    @Before
    public void setUp() {
        decaJavelinThrow = new DecaJavelinThrow();
    }

    @Test
    public void test_RimligDistans() {
        // Testa en rimlig distans som är acceptabel.
        double validDistance = 35;
        decaJavelinThrow.calculateResult(validDistance);
        assertEquals("The result is: " + decaJavelinThrow.score, decaJavelinThrow.score, 508);
    }

    @Test
    public void test_FörLågDistans() {
        // Testa distansen för låg, som inte är godkänt
        double negativeDistance = 0;
        decaJavelinThrow.calculateResult(negativeDistance);
        assertEquals("The result is: " + decaJavelinThrow.score, decaJavelinThrow.score, 0);
    }

    @Test
    public void test_FörHögDistans() {
        // Testa distansen som är för hög, som inte är godkänt
        double tooHighDistance = 120.0;
        decaJavelinThrow.calculateResult(tooHighDistance);
        assertEquals("The result is: " + decaJavelinThrow.score, decaJavelinThrow.score, 0);
    }

    @Test
    public void test_DEHYHY() {
        // Testa en rimlig distans som är acceptabel.
        double validDistance = 40;
        decaJavelinThrow.calculateResult(validDistance);
        assertEquals("The result is: " + decaJavelinThrow.score, decaJavelinThrow.score, 4442);




    }

}