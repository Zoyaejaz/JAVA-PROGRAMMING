public class dectobinary {
    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int bin_num=0;
        while (n>0){
            int rem=n%2;
            bin_num=bin_num + (rem *(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of "+mynum+":"+ bin_num);
    }
    public static void main(String args[]){
        dectobin(7);

    }
    
    
}
