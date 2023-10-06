public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        } 
        else if (number == 0) {
            System.out.println("Zero");
            return;
        } 
        
        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            String word = "";

            switch (lastDigit) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
            }

            System.out.print(word + " ");

            reversedNumber /= 10;
        }

        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            System.out.print("Zero ");
        }

        System.out.println();
    }

    public static int reverse(int number) {
        int reversed = 0;
        int tempNumber = Math.abs(number);

        while (tempNumber > 0) {
            int lastDigit = tempNumber % 10;
            reversed = reversed * 10 + lastDigit;
            tempNumber /= 10;
        }

        return (number < 0) ? -reversed : reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}