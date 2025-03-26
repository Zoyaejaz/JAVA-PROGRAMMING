public class Logical {
    public static void main(String arg[]){
        // AND operator
        System.out.println((3>2)&&(5>0));
        System.out.println((3>2)&&(5<0));
        System.out.println((3<2)&&(5>0));
        System.out.println((3>2)&&(5!=0));
        // OR operator
        System.out.println((3>2)||(5>0));
        System.out.println((3>2)||(5<0));
        System.out.println((3<2)||(5>0));
        System.out.println((3<2)||(5<0));
        //NOT operator
        System.out.println(!(3>2));
        System.out.println(!(5<0));

    }    
}
