public class constructors {
    public static void main(String args[]){
        Student s1= new Student("zoya");
        System.out.println(s1.name);
        Student s2=new Student();
        Student s3=new Student(45);
        System.out.println(s3.roll);

    }

    static class Student{
        String name;
        int roll;

        Student(String name){  // here student() is a constructor and "string name" whisc we have written
            this.name=name;  // inside the bracket is the initialization 
        }
        Student(){     //this is non-parametric constructor
            System.out.println("This is a non parametric constructor");
        }
        Student (int roll){  //this is parametric constructor
            this.roll=roll;
        }
    }
    
}
