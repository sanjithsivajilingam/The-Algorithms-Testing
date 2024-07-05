package Mode;
import static org.junit.Assert.*;
import org.junit.Test;

public class ISPTesting {
	 @Test
	 public void testModeWithEmptyInput() {
		 int[] numbers = {};
		 assertNull(Mode.mode(numbers));
	 }

	 @Test
	 public void testModeWithNonEmptyInput() {
		 int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
		 int[] expectedModes = {4};
	     assertArrayEquals(expectedModes, Mode.mode(numbers));
	 }
}