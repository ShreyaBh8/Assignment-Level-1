import java.util.*;
public class BouncyNumber {
    public static boolean isBouncy(int number) {
        if (number < 100) {
            return false;
        }
        boolean increasing = false;
        boolean decreasing = false;

        int previousDigit = number % 10;
        number /= 10;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit < previousDigit) {
                increasing = true;
            }
            else if (currentDigit > previousDigit) {
                decreasing = true;
            }
            if (increasing && decreasing) {
                return true;
            }
            previousDigit = currentDigit;
            number /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (isBouncy(number)) {
            System.out.println(number + " is a bouncy number.");
        } else {
            System.out.println(number + " is not a bouncy number.");
        }
    }
}
