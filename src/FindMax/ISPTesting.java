package FindMax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class ISPTesting {
	@Test
    public void testFindMaxWithNonEmptyInput() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(5, FindMax.findMax(numbers));
    }

    @Test
    public void testFindMaxWithEmptyInput() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {FindMax.findMax(numbers);});
    }
}