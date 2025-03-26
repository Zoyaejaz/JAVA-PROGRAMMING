public class searchlinear {
    public static int linearsearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
              
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"juice","falafel","samosa","shawrma","biryani","salad","water","noodles"};
        String key = "samosa";
        int index = linearsearch(menu,key);
        if(index ==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index"+ " "+index);
        }

    }
    
}
