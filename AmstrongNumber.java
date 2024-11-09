
import java.util.*;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String strNum = sc.next();
        int n = Integer.valueOf(strNum);
        int c = strNum.length();
        int d, s = 0;
        for (int i = n; i > 0; i = i / 10) {
            d = i % 10;
            s += (int) Math.pow(d, c);
        }
        if (s == n) {
            System.out.println(n+" is an amstrong number");
        } 
        else {
            System.out.println(n+" is not an amstrong number");
        }
        sc.close();
    }
}
