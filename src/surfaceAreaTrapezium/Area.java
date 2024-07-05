package surfaceAreaTrapezium;

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
     * Calculate the area of a trapezium.
     *
     * @param base1  upper base of trapezium
     * @param base2  bottom base of trapezium
     * @param height height of trapezium
     * @return area of given trapezium
     */
    public static double surfaceAreaTrapezium(final double base1, final double base2, final double height) {
        if (base1 <= 0) {
            throw new IllegalArgumentException(POSITIVE_BASE + 1);
        }
        if (base2 <= 0) {
            throw new IllegalArgumentException(POSITIVE_BASE + 2);
        }
        if (height <= 0) {
            throw new IllegalArgumentException(POSITIVE_HEIGHT);
        }
        return (base1 + base2) * height / 2;
    }
}
