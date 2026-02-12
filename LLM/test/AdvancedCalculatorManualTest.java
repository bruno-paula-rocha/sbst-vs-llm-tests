import static org.junit.Assert.*;
import org.junit.Test;

public class AdvancedCalculatorManualTest {

    private final AdvancedCalculator calc = new AdvancedCalculator();

    // ADD
    @Test
    public void testAddPositive() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    public void testAddZero() {
        assertEquals(7, calc.add(7, 0));
    }

    // SUBTRACT
    @Test
    public void testSubtractPositive() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testSubtractNegative() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    // MULTIPLY
    @Test
    public void testMultiplyPositive() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calc.multiply(5, 0));
    }

    @Test
    public void testMultiplyNegative() {
        assertEquals(-6, calc.multiply(-2, 3));
    }

    // DIVIDE
    @Test
    public void testDivideExact() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivideFloor() {
        assertEquals(2, calc.divide(5, 2)); // integer division check
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calc.divide(10, 0);
    }

    // EVEN
    @Test
    public void testIsEvenTrue() {
        assertTrue(calc.isEven(4));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse(calc.isEven(5));
    }

    @Test
    public void testIsEvenNegative() {
        assertTrue(calc.isEven(-2));
    }
}
