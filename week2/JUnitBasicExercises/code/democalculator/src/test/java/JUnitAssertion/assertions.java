package week2.JUnitBasicExercises.code.democalculator.src.test.java.JUnitAssertion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class assertions {
    
    @Test
    public void testAssertions() {
            // Assert equals 
        assertEquals(5, 2+3); 
 
        // Assert true 
        assertTrue(5 > 3); 
 
        // Assert false 
        assertFalse(5 < 3); 
 
        // Assert null 
        assertNull(null); 
 
        // Assert not null 
        assertNotNull(new Object()); 
    }
}
