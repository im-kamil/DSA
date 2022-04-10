public class Patternprinting {
    // print a pattern according to given value A
    // example for A=3 pattern looks like 1
    // 2 1
    // 3 2 1
    public int[][] solve(int n) {
        int arr[][] = new int[n][n];
        int k = 1;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j <= i; j--) {
                if (k - 1 <= i) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = k;
                    k++;
                }
            }
        }
        return arr;
    }

}
