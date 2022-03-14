import java.lang.reflect.Array;

public class TimeandSpace {
   void foo(int arr[], int length){
       int sum=0;
       int product=31;
       for(int i=0; i<length; i++){
           sum += arr[i];
       }
       for(int i=0; i<length; i++){
           product *= arr[i];
       }
   } 

public static void main(String[] args) {
    int arr[] = {3,5,66};
    
}
}
