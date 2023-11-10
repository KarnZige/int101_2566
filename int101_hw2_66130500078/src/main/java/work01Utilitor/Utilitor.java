package work01Utilitor;

public final class Utilitor {
    public static String testString(String value) {
        if (value == null) { throw  new NullPointerException(); }
        if (value.isBlank()) { throw new IllegalArgumentException(); }
        return value;
    }

    public static double testPositive(double value) {
        if (value < 0) { throw new IllegalArgumentException(); }
        return value;
    }

    public static String computeIsbn10(long isbn10) {
        int sum = 0;
        int weight = 10; // Starting weight for ISBN-10 is 10

        while (isbn10 > 0) {
            long currentDigit = isbn10 % 10;
            sum += (int) (currentDigit * weight);
            weight--; // Decrease weight by 1 for each digit
            isbn10 /= 10;
        }

        int checkDigit = 11 - (sum % 11);
        return String.valueOf(checkDigit);
    }
}
