import java.util.*;
public class DudeneyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int nCube=(int) Math.cbrt(n);
        int d,s=0;
        for(int i=n;i>0;i=i/10){
            d=i%10;
            s+=d;
        }
        if(s==nCube){
            System.out.println(n+" is a dudeney number");
        }
        else{
            System.out.println(n+" is not a dudeney number");
        }
        sc.close();
    }
}