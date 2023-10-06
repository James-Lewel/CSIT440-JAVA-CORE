import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        
        
        while (true) {
            boolean isInt = scanner.hasNextInt();
            
            if(isInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            else {
                break;
            }
        }
        
        if (count > 0) {
            average = Math.round((double)sum / (double)count);
        }
        System.out.print("SUM = " + sum + " AVG = " + average);
    }
}