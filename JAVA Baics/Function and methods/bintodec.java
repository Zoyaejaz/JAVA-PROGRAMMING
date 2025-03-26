public class bintodec {
    public static void bintodec(int binnum){
        int pow = 0;
        int decnum = 0;
        while(binnum>0){
            int lastdigit = binnum%10;
            decnum = decnum +(lastdigit*(int)math(2,pow));
            pow++;
            binnum = binnum/10;
        }
        System.out.println("decimal of"+binnum+"="+decnum);
    }
    
}
