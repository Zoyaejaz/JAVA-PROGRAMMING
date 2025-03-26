public class methodoverriding {
    public static void main(String args[]){
        Deer d=new Deer();
        d.eat();

    }
    
}
class Animal_1{
    void eat(){
        System.out.println("eats");
    }
}
class Deer extends Animal_1{
    void eat(){
        System.out.println("Herbivores,eats grass");
    }
}
//this is method overriding,it comes under the run time polymorphism.it grt executed in run time. and here 
//we see that the function eat is there in both classes but have different definitions also in both.
//that's why when we call eat in main function the function of that class get executed and not the function
//of the base class
