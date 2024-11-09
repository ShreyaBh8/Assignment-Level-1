import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
            }
        }
        if(s>n){
            System.out.println(n+" is an abundant number");
        }
        else{
            System.out.println(n+" is not an abundant number");
        }  
        sc.close();
    }
    
}
