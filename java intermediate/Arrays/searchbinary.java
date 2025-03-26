public class searchbinary {
    public static int binarysearch(int number[],int key){
        int start=0 ,  end=number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        int number[]={1,2,4,5,7,9,10,12,15,19,40};
        int key=10;
        System.out.println("The index is"+" "+ binarysearch(number,key));
    }   
}
