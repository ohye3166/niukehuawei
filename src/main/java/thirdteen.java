import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-25-20:49
 */
public class thirdteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] - '0' >= 0) && (arr[i] - '0' <= 9)) {
                    sb.append("*" + arr[i] + "*");
                } else {
                    sb.append(arr[i]);
                }
            }
            System.out.println(sb.toString().replace("**", ""));
        }

    }
}
