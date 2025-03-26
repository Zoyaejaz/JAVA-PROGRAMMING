import java.util.*;
public class ques{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(i);
            if(i<n-1){
            System.out.print(",");
        }
       
        }
        System.out.print("]");
    }
}