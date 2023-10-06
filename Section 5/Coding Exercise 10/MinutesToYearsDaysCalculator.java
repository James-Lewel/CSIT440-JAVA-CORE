public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) {
            System.out.print("Invalid Value");
            return;
        }
        
        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / (60 * 24);

        System.out.print(minutes + " min = " + years + " y and " + days + " d");
    }
}