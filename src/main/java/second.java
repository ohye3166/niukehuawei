/**
 * @author chenzongyi
 * @create 2020-06-25-11:24
 */
import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double n = sc.nextDouble();
            System.out.printf("%.1f",function(n));
        }
    }

    private static double function(double n) {
        double low = 0.0;
        double high = n;
        double mid = n / 2;

        while(high - mid >0.01){
            if(mid * mid * mid > n) {
                high = mid;
            }else{
                low = mid;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }
}
