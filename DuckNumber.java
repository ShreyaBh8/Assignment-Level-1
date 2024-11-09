import java.util.*;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int d,f=0;
        for(int i=n;i>0;i=i/10){
            d=i%10;
            if(d==0){
                f=1;
            }   
        }
        if(f==1){
            System.out.println(n+" is a duck number");
        }
        else{
            System.out.println(n+" is not a duck number");
        }
        sc.close();
    }
}