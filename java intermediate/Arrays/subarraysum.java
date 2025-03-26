public class subarraysum {
    public static void printsum(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int sum=i+j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+"");
                }
                
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
}
