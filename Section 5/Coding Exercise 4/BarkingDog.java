public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 24) {
            return false;
        }
        
        if(isBarking && hourOfDay < 8 || isBarking && hourOfDay > 22) {
            return true;
        }
        
        return false;
    }
}