package Average;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class ISPTesting {
	@Test
    public void testAverageWithNullInput() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
    }

    @Test
    public void testAverageWithEmptyInput() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {Average.average(numbers);});
    }

    @Test
    public void testAverageWithNonEmptyInput() {
        int[] numbers = {10, 20, 30, 40, 50};
        assertEquals(30, Average.average(numbers));
    }
}
