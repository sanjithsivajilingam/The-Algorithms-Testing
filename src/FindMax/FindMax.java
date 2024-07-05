package FindMax;

public final class FindMax {
	 public static int findMax(final int[] array) {
	        int n = array.length;
	        if (n == 0) {
	            throw new IllegalArgumentException("Array must be non-empty.");
	        }
	        int max = array[0];
	        for (int i = 1; i < n; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    }
}
