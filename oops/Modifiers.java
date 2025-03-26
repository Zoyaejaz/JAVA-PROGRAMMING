public class Modifiers {
    public static void main(String args[]){
        Bankaccount myacc=new Bankaccount();
        myacc.username="zoya ejaz";
        myacc.password="yybydeudeuc";   //it will give an error because the password data is private
        myacc.setpwd("eybeudb"); //this will be right because setpwd is public

    }
    
    class Bankaccount{
        public String username;
        private String password;
        public void setpwd(String pwd){
            password= pwd;
        }

    }
}
