import java.util.random.*;

public class program2 {
    static int random(int a) {
        int i;
        int num = (rand() % (a + 1));
        return num;
    }

    private static int rand() {
        return 0;
    }

    static int function(int n) {
        int i ;
        if (n <= 0) {
            return 0;
        } else {
            i = random(n - 1);
            System.out.println("this");
            return function(i) + function(n - 1 - i);
        }

    }

    public static void main(String[] args) {
        function(6);
    }
}
