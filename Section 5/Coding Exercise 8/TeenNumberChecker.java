public class TeenNumberChecker {
    public static boolean hasTeen (int i, int j, int k) {
        return isTeen(i) || isTeen(j) || isTeen(k);
    }
    
    public static boolean isTeen (int i) {
        return (i >= 13 && i <= 19);
    }
}