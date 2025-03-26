public class OOPS{
    public static void main(String[] args) {
        Pen P1= new Pen(); //created a pen object called P1
        P1.setcolor("Blue");
        System.out.println(P1.color);
        P1.settip(5);
        System.out.println(P1.tip);
        P1.color="yellow";
        System.out.println(P1.color);
    }

}
class Pen{
    String color;
    int tip;
    
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calculatepercentage(int mat,int phy,int chem){
        percentage=(mat+phy+chem)/3;
    }
}