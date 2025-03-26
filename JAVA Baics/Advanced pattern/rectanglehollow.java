

public class rectanglehollow {
    public static void hollow_rectangle(int rows,int colmn){
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=colmn;j++){
                if(i==1||i==rows||j==1||j==colmn){
                    System.out.println("*");
                }
                else{
                    System.out.print(" ");
                }       
            }
            System.out.println( );
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4,5);
    }
    
}
