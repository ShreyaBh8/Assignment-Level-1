import java.util.Scanner;
public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int x = 0, y = 1, z = 1, w=0;
        System.out.print(x + " " + y + " " + z);
        while (w<n) {
            w = x + y + z;
            System.out.print(" " + w);
            x = y;
            y = z;
            z = w;
        }
        sc.close();
    }
}
