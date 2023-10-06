public class LastDigitChecker {
    public static boolean hasSameLastDigit(int i, int j, int k) {
        if(!isValid(i) || !isValid(j) || !isValid(k)) {
            return false;
        }
        
        int iLastDigit = i % 10;
        int jLastDigit = j % 10;
        int kLastDigit = k % 10;

        return iLastDigit == jLastDigit || iLastDigit == kLastDigit || jLastDigit == kLastDigit;
    }
    
    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000) ? true : false;
    }
}