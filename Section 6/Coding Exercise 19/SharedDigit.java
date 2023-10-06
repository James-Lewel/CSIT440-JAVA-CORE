public class SharedDigit {
    public static boolean hasSharedDigit(int i, int j) {
        if(i < 10 || i > 99 || j < 10 || j > 99) {
            return false;
        }
        
        String iString = Integer.toString(i);
        String jString = Integer.toString(j);
        
        for (char digit : iString.toCharArray()) {
            if (jString.contains(Character.toString(digit))) {
                return true;
            }
        }
        return false;
    }
}