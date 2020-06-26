import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

/**
 * @author chenzongyi
 * @create 2020-06-26-11:47
 */
public class eighteen {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = bf.readLine()) != null){
            function(str);
        }
    }

    private static void function(String str) {
        if(str.indexOf(" ") != -1) {
            System.out.println("NO");
            return;
        }
        int flag = 0;
        String[] strs = str.split("\\.");
        //System.out.println(strs.length);
        for(String str1 : strs){
            int num = Integer.parseInt(str1);
            //System.out.println(num);
            if(num > 255 || num < 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
