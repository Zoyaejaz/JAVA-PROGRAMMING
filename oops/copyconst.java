public class copyconst {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="zoya";
        s1.rollno=60;
        s1.password="dbuebd";
        s1.marks[0]=40;
        s1.marks[1]=60;
        s1.marks[2]=80;
        
        //creating a copy of s1 using copy  constructor
        Student s2=new Student(s1); // by creating a copy constructor in class we have make marks,name
        s2.password="idneinwei";    //and rollno same of student 1 and just change the password
        s2.marks[2]=100;   //if we make changes in s2 then we get the changes in s1 also beacuse we have copy the reference of s1
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]); //printing marks of s2 to check if copy is successful or not
        } 
        System.out.println("Marks of s1 (to check if they remain unchanged):");
            for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
    }
}

        static class Student{
        String name;
        int rollno;
        String password;
        int marks[];

        Student(){
            marks=new int[3];
        }

        // Student(Student s1){     //copy constructor  //this is a shallow copy constructor bcz we are copying the reference of s1
        //     this.rollno=s1.rollno;
        //     this.name=s1.name;
        //     marks=new int[3];  //it will ensure that in every constructor it has 3 list of marks
        //     this.marks=s1.marks;  //this is shallow copy constructor that's why we do not make a new array of marks here,copy the reference and not the value 
            
        // }

        Student(Student s1){     //copy constructor  //this is a deep copy constructor bcz we are not copying the reference of s1
            this.rollno=s1.rollno;
            this.name=s1.name;
            marks=new int[3];  //it will ensure that in every constructor it has 3 list of marks,create a new array
            for(int i=0;i<marks.length;i++){
                this.marks[i]=s1.marks[i];  //this is deep copy constructor that's why we are making a new array of marks here 
            } //copy the value    
        }
    }    
 }

//we  can see out the difference between the copy constructor and tell that which type of array is it, is it shallow constructor or deep
// constructor by seeing the array in it,  if we are making a new array in the constructor then it is the deep constructor and if we are
// not making a new array it is a shallow constructor.
//so on changing the index or value of an array will reflect the changes in the reference array in shallow copy constructor case 
//but this does not happen or reflect changes in the deep copy constructor. 
