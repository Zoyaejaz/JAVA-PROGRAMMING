public class swap {
    public static void change(int a,int b){
        int temp = a;
        a=b;
        b =  temp;
        System.out.println("a:" +a);
        System.out.println("b:"+b);
    }
        public static void main(String args[]){
            int a = 5;
            int b = 10;
            change(a, b);
            //If we write the print statemenet for a and b here then it will print the given input value of a and b and will not swap it
        }

    
}
