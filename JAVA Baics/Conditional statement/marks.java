import java.util.*;
public class marks {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        String reportcard=(marks>33) ? "Pass" :"Fail"; //in string s should be capital 
        System.out.println(reportcard);
    }
    
}
