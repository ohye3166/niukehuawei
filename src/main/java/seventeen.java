import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-26-11:34
 */
public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(function(m, n));
        }
    }

    private static int function(int m, int n) {
        if(m == 0 || n == 0){
            return 1;
        }
        return function(m,n-1) + function(m - 1,n);
    }
}
