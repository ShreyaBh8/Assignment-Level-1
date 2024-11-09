import java.util.*;
public class HarshadMagicNumber {
    public static int digitSum(int n){
        int d,s=0;
        for(int i=n;i>0;i=i/10){
            d=i%10;
            s+=d;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=digitSum(n);
        if(n%s==0){
            while(s!=1){
                s=digitSum(s);
            }
            if(s==1){
                System.out.println(n+" is a harshad magic number");
            }
            else{
                System.out.println(n+" is not a harshad magic number");
            }
            sc.close();
        }
    }
}
