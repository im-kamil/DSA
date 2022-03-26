public class rotatearray {
   // given an array of size N and an int K rotate this array K times from right to left 
//    1,2,3,4,5,6,7 input
// output if k =1 --> 7,1,2,3,4,5,6
// if k=2 --> 6,7,1,2,3,4,5 
// apply brute force 
// 1 times 
rotate Right(arr[], N ){
    temp = arr[N-1];
    for(int i=N-1; i>0; i--){
      arr[i] = arr[i-1];
    }
    arr[0] = temp;
}
// repeat this process K times 
rotate Right K (arr[], N, K ){
    while(K>0){
        rotate right(arr, N);
        k--; 
    }
    //  observation 2 
    void reverse (int arr[], int N, int start, int end){
        for (int i = N-1; i < 0; i++) {
             arr[(n -K- 1) - i] = arr[i];
        }
        k = k%N; 
         rotate K (arr[] , N , K){
             reverse (arr, N, 0, N-K-1);
             reverse (arr, N, N-K, N-1);
             reverse (arr, N, 0, N-1);

         }
    }
    
}
