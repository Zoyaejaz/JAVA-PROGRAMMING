public class primeornot {
    public static boolean isprime(int n){
        boolean isprime = true;
        for(int i=1;i<=n;i++){
            if(i%n==0){
                isprime = false;
                break;
            }
        }
        return isprime;

    }
    public static void main(String args[]){
        System.out.println(isprime(4));
    }
    
}
