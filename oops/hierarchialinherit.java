public class hierarchialinherit {
    public static void main(String args[]){
        dog dobby=new dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        fish shark=new fish();
        shark.breathe();
        shark.swim();
        bird crow=new bird();
        crow.fly();

    }
    
}
class Animal {
    String color;
    void breathe(){
        System.out.println("breathes");
    }
    void eat(){
        System.out.println("eats");
    }
}
class dog extends Animal{
    int legs;
}
class fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
