import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-25-19:13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count = sc.nextInt();
            int minCount = 0;
            int maxCount = 0;
            int sum = 0;
            for(int i = 0;i < count;i++){
                int num = sc.nextInt();
                if(num < 0)
                    minCount++;
                else if(num > 0){
                    maxCount++;
                    sum += num;
                }
            }
            double avg = (double)sum / (double)maxCount;
            System.out.printf(minCount + " " + "%.1f",avg);
            System.out.println();
        }
    }
}
