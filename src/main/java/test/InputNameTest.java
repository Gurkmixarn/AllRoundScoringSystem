import common.InputName;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputNameTest {

    private InputName inputName;

    @Before
    public void setUp() {
        inputName = new InputName();
    }

    @Test
    public void test_ValidName() {
        // Testa ett giltigt namn med bara bokstäver.
        String validName = "Fredde";
        String result = inputName.addCompetitor();
        assertEquals(validName, result);
    }

    @Test
    public void test_InvalidNameWithNumbers() {
        // Testa ett namn med siffror = ogiltigt.
        String invalidName = "Fredde123";
        String result = inputName.addCompetitor();
        assertNotEquals(invalidName, result);
    }
}