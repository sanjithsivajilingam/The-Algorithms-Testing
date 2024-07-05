package Upper;

public class Upper {
    public static String toUpperCase(String s) {
        if (s == null || "".equals(s)) {
            return s;
        }
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; ++i) {
            if (Character.isLetter(values[i]) && Character.isLowerCase(values[i])) {
                values[i] = Character.toUpperCase(values[i]);
            }
        }
        return new String(values);
    }
}