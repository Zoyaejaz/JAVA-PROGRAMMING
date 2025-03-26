public class superkey {
    public static void main(String args[]){
        Maruti m1=new Maruti();

    }
    
}
class Car{
    Car(){  //constructor
        System.out.println("car constructor is called");

    }
}
class Maruti extends Car{
    Maruti(){
        super();  //this will print out the animal constructor also btw if we don't write super then also the programme will call animal constructor by default
        System.out.println("maruti constructor is called");
    }

}