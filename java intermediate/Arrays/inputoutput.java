import java.util.*;
public class inputoutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[]= new int[40];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy" + marks[0]);
        System.out.println("chem" + marks[1]);
        System.out.println("math" + marks[2]);
        marks[2] = 1;
        System.out.println("math" + marks[2]);
        System.out.println("length" + marks.length);


    }
    
}
