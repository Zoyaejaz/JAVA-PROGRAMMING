public class workinterface {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        Bear b= new Bear();
        b.eat();
        b.teeth();

    }
    
}
interface Chessplayer{
    void moves();   //we will not write the implementaion here bcz we have to implement abstraction here
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal..in all direction");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("uo,down,left,right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("uo,down,left,right,diagonal(at 1 step)");
    }
}
//multiple inheritance
interface herbivore {
    void eat();
}
interface carnivore{
    void teeth();
    void eat();
}
class Bear implements herbivore,carnivore{
    public void eat(){
        System.out.println("Eats both plant as well as animals");
    }
    public void teeth(){
        System.out.println("Having sharp teeth");
    }

}

