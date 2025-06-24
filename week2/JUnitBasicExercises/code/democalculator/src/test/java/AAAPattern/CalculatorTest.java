package week2.JUnitBasicExercises.code.democalculator.src.test.java.AAAPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import week2.JUnitBasicExercises.code.democalculator.src.main.java.com.example.calculator; // Adjust the import based on your package structure
public class CalculatorTest {

    private calculator calculator;

    @Before
    public void setUp() {
        calculator = new calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(5, result);
    }
}

