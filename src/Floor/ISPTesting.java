package Floor;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ISPTesting {
	@Test
    public void testFloorWithWholeNumber() {
        double number = 5.0;
        assertEquals(5.0, Floor.floor(number), 0.0001);
    }

    @Test
    public void testFloorWithNonWholeNumber() {
        double number = 5.8;
        assertEquals(5.0, Floor.floor(number), 0.0001);
    }
}
