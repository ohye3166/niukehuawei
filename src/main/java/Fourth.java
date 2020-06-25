import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-25-12:42
 */
public class Fourth {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        double sum = 0;
        double avg;
        int temp;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            temp = sc.nextInt();
            if(temp < 0)
                count++;
            else{
                count1++;
                sum += temp;
            }
        }
        System.out.println(count);//负数个数
        if(count1 == 0) {
            System.out.println("0.0");
            return;
        }
        avg = sum / count1;
        System.out.printf("%.1f",avg);
    }
}
