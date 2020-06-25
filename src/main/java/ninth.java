import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-25-16:56
 */
public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int count = sc.nextInt();
            double avg = (double) (2 + 2 + (3 * (count - 1))) / 2;
            int sum = (int) ((int) count * avg);
            System.out.println(sum);
        }
    }
}
