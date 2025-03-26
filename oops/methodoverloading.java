public class methodoverloading {
    public static void main(String arg[]){
        Calculator calc=new Calculator();
        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum((float) 4.5,(float) 3.8));
        System.out.println(calc.sum(2,4,6));
        

    }
    
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b; 
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
//this is method overloading which comes under compile time polymorphism. it gets executed in compile time 
//and here we see we have make same function sum but have put different parameters there where we put 
//different type ot different count of parameters. so at the compile time it gets executed according to that
