import java.util.*;
public class primecheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n is prime");
        }
        else{
            boolean isPrime=true;
        for(int i = 2;i<=n-1;i++){
            if(n%i==0){  //here i will be between 2 to n-1. so that it can see wheter it has multiple in btw or not
                isPrime=false;
            }
            if(isPrime==true){
                System.out.println("n is Prime");

            }
            else{
                System.out.println("n is not prime");
            }

        }
        }

        
    }
    
}
