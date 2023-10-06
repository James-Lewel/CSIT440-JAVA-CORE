public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        
        String string = Integer.toString(number);
        return Character.getNumericValue(string.charAt(0)) + Character.getNumericValue(string.charAt(string.length() - 1));
    }
}