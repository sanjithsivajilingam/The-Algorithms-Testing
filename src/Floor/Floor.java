package Floor;

public final class Floor {
	public static double floor(double number) {
        if (number - (int) number == 0) {
            return number;
        } else if (number - (int) number > 0) {
            return (int) number;
        } else {
            return (int) number - 1;
        }
    }
}
