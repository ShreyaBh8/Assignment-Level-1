import java.util.*;
public class TechNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int c = 0,f,l,k,s;
        for (int i = n; i > 0; i = i / 10) {
            c++;
        }
        if(c%2==0){
            k = (int) Math.pow(10, c / 2);
            f=n/k;
            l=n%k;
            s=(int) Math.pow(f+l,2);
            if(s==n){
                System.out.println(n+" is a tech number");
            }
            else{
                System.out.println(n+" is not a tech number");
            }  
        }  
        sc.close();
    }
}
