import java.util.*;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=(int)Math.pow(n, 2),sum=0;
        for(int i=s;i>0;i=i/10){
            int d=i%10;
            sum+=d;
        }
        if(sum==n){
            System.out.println(n+" is an neon number");
        }
        else{
            System.out.println(n+" is not an neon number");
        }  
        sc.close();

    }
}
