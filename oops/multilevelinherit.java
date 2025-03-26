public class multilevelinherit {
    public static void main(String args[]){
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        dobby.breed="chihuana";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);


    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class mammal extends Animal{
    int legs;
}
class Dog extends mammal{
    String breed;
}
