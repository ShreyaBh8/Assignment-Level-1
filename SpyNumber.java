import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0,p=1,d;
        for(int i=n;i>0;i=i/10){
            d=i%10;
            s=s+d;
            p=p*d;
        }
        if(s==p){
            System.out.println(n+" is a spy number");
        }
        else{
            System.out.println(n+" is not a spy number");
        }
        sc.close();
    }
}