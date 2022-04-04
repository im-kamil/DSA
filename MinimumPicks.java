public class MinimumPicks {
    // you are given an array of integers A of size N .return the difference between
    // maximum among all even numbers of A and minimum
    // among all odd numbers in A
    // input [0,2,9]
    // output = 2-9 = -7
    // input [5,17,100,1]
    // output = 100-1 = 99
    public int solve(int[] ar) {
        int max = -999999;
        int min = 999999;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                if (ar[i] > max) {
                    max = ar[i];
                } else {
                    if (ar[i] < min) {
                        min = ar[i];
                    }
                }
            }
        }
        return max - min;
    }
}
