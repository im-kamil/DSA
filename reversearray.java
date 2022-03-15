public class reversearray {
    // given an array = {7,5,4,2,6} reverse the array
    // final array = {6,2,4,5,7} [0]<->(n-1),
    // [1]<->(n-1)-1.[2]<->(n-1)-2.....[i]<->(n-1)-i
    // step1 = create a new array
    // step2 = arr2[i] = arr[(n-1)-i];
     reversearray(int arr[], int n) {
        //  int arr2[n];
        for (int i = 0; i < n; i++) {
            arr[i] = arr[(n - 1) - i];
        }
    }
}
