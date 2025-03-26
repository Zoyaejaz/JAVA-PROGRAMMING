public class getset {
    public static void main(String args[]){
        Pen p1= new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());

        

    }

    static class Pen{
        String color;
        int tip;

        String getcolor(){     // these are getters which are used as a function to get the color 
            return this.color;
        }
        int gettip(){          // this is also a getters 
            return this.tip;
        }

        void setcolor(String newcolor){  //these are setters which sets the value in that function
            this.color=newcolor;
        }

        void settip(int newtip){
            this.tip= newtip;
        }
    }
    
}
