public class statickey {
    public static void main(String arge[]){
        Student s1=new Student();
        s1.name="Ahmed";
        s1.Schoolname="Jamia";
        Student s2=new Student();
        System.out.println(s2.Schoolname);//in static keyword when we make changes in one objects we will see the changes in other object also
        System.out.println(s2.name);

    }
    
}
class Student{
    String name;
    int roll_no;
    static String Schoolname; // this keyword is static this is the properties which is made as static keyword
}
