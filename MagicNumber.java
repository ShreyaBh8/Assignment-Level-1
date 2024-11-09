import java.util.Scanner;
public class MagicNumber {
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
        int sum=digitSum(n);
        while (sum!=1) { 
            sum=digitSum(sum);
        }
        if(sum==1){
            System.out.println(n+" is a magic number");
        }
        else{
            System.out.println(n+" is not a magic number");
        }
        sc.close();
    }
}
