import java.util.*;
public class PronicNumber {   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,f=0;
        for(i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println(n+" is a pronic no");
        }
        else
        {
            System.out.println(n+" is not a pronic no");
        }
    }   
}


