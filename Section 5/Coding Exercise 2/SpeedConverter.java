public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }
    
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.print("Invalid Value");
        }
        else {
            System.out.print(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}