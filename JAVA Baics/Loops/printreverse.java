public class printreverse {
    public static void main(String arg[]){
        int n = 99801;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
    }
    
}
