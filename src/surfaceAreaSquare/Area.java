package surfaceAreaSquare;

/**
 * Find the area of various geometric shapes
 */
public class Area {

    /**
     * String of IllegalArgumentException for radius
     */
    private static final String POSITIVE_RADIUS = "Must be a positive radius";

    /**
     * String of IllegalArgumentException for height
     */
    private static final String POSITIVE_HEIGHT = "Must be a positive height";

    /**
     * String of IllegalArgumentException for base
     */
    private static final String POSITIVE_BASE = "Must be a positive base";

    /**
     * Calculate the area of a square.
     *
     * @param sideLength side length of square
     * @return area of given square
     */
    public static double surfaceAreaSquare(final double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Must be a positive sideLength");
        }
        return sideLength * sideLength;
    }
}
