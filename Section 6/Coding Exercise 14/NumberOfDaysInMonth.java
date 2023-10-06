public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
        }
        
        return false;
    }
    
    public static int getDaysInMonth(int year, int month) {
        if (month < 1 || month > 12 && year < 1 || year > 9999) {
            return -1;
        }

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return daysInMonth[month - 1];
    }
}