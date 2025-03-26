public class abstractclasses {
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();
        h.changecolor();
        Chicken c=new Chicken();
        c.eat();
        c.walk();

    }
    
}
abstract class Animal_2{
    String color;
    Animal_2(){
        String color="brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk(); //by writing this function we are just giving an idea that this walk() function has to be implemented in other classes 
}
class Horse extends Animal_2{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changecolor(){
        color="dark brown";
        System.out.println(color);
    }
}
class Chicken extends Animal_2{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changecolor(){
        color="white";
        System.out.println(color);
    }
}

