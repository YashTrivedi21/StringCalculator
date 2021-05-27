import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator tst;
    @BeforeEach
    void setUp() {
        tst = new StringCalculator();
    }

    @Test
    public void singleNumberTest() {
        assertEquals(tst.add("2"), 2);
    }

    @Test
    public void emptyStringTest() {
        assertEquals(tst.add(""), 0);
    }

    @Test
    public void multiDigitsTest() {
        assertEquals(tst.add("420,69"), 489);
    }

    @Test
    public void twoNumbersTest() {
        assertEquals(tst.add("4,9"), 13);
    }
}