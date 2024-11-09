import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int d,s=0;
        for(int i=n;i>0;i=i/10){
            d=i%10;
            s+=d;
        }
        if(n%s==0){
            System.out.println(n+" is a harshad number");
        }
        else{
            System.out.println(n+" is not a harshad number");
        }
        sc.close();
    }
    
}
