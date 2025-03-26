import java.util.*;
public class funparam {
    public static int calculatesum(int num1,int num2)//here num1 and num2 are called parameters or formal parameters
    {
        int sum = num1 + num2;
        return sum;
        
    }
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=calculatesum(a,b);//here a and b are called arguments or actual parameters
        System.out.println(sum);
        
    
    }
    
}

