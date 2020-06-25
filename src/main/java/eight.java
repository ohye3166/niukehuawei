import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

/**
 * @author chenzongyi
 * @create 2020-06-25-16:02
 */
public class eight {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = bf.readLine()) != null){
            int count = Integer.parseInt(str);
            str = bf.readLine();
            String[] strs = str.split(" ");
            int []nums = new int[count];
            int i = 0;
            for(String str1 : strs){
                nums[i++] = Integer.parseInt(str1);
            }
            str = bf.readLine();
            int flag = Integer.parseInt(str);
            function(nums,flag);
            System.out.println();
        }
    }

    private static void function(int[] nums, int flag) {
        Arrays.sort(nums);
        if(flag == 0){
            for(Integer num : nums){
                System.out.print(num + " ");
            }
        }
        else{
            for(int i = nums.length - 1;i >= 0;i--){
                System.out.print(nums[i] + " ");
            }
        }
    }
}
