public class hybridinherit {
    public static void main(String args[]){
        shark dobby=new shark();
        dobby.eat();
        dobby.color="Blue";
        System.out.println(dobby.color);
        crow african=new crow();
        african.fly();
        african.size=35;
        System.out.println(african.size);

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
class shark extends fish{
    String color;
}
class dolphin extends fish{
    int soundrange;
}
class crow extends bird{
    int size;
}
    

