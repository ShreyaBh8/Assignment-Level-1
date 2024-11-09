import java.util.*;
public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String strNum = sc.next();
        int n = Integer.valueOf(strNum);
        int c = strNum.length();
        int d, s = 0;
        for (int i = n; i > 0; i = i / 10) {
            d = i % 10;
            s += (int) Math.pow(d, c);
            c--;
        }
        if (s == n) {
            System.out.println(n+" is a diarium number");
        } 
        else {
            System.out.println(n+ " is not a diarium number");
        }
        sc.close();
    }
}
