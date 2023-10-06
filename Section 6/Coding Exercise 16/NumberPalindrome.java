public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String string = Integer.toString(Math.abs(number));
        StringBuilder reversedNumber = new StringBuilder(string).reverse();
        
        return string.equals(reversedNumber.toString());
    }
}