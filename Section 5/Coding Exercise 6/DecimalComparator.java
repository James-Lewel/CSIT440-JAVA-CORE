public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double i, double j) {
        return (int) (i * 1000) == (int) (j * 1000);
    }
}