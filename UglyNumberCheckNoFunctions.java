public class UglyNumberCheckNoFunctions {

    public static void main(String[] args) {
        int number = 28; // Example number

        if (number <= 0) {
            System.out.println(number + " is not an ugly number.");
        } else {
            int num = number;
            
            // Divide the number by 2 as long as it's divisible
            while (num % 2 == 0) {
                num /= 2;
            }

            // Divide the number by 3 as long as it's divisible
            while (num % 3 == 0) {
                num /= 3;
            }

            // Divide the number by 5 as long as it's divisible
            while (num % 5 == 0) {
                num /= 5;
            }

            // If the result is 1, it is an ugly number
            if (num == 1) {
                System.out.println(number + " is an ugly number.");
            } else {
                System.out.println(number + " is not an ugly number.");
            }
        }
    }
}
