import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-25-14:22
 */

/*
* 思路：先收到一个数组，然后开始从头开始遍历，看有多少比前一个小的
* */
public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            int[] nums = new int[length];
            for(int i = 0;i < length;i++){
                nums[i] = sc.nextInt();
            }
            function(nums);
        }
    }

    /*
    * 从头开始遍历，动态规划
    * 设置brr[length]，一开始都默认为1，此点为i
    * 然后在0-i的范围内找到一个最大并且，值要小于num[i]的一个数字。brr[i] = max（brr[j]） + 1
    *
    * */
    private static void function(int[] nums) {
        int length = nums.length;
        int[] brr = new int[length];
        for(int i = 0;i <length;i++){
            brr[i] = 1;
            for(int j = 0;j < i;j++){
                if(nums[i] > nums[j])
                    brr[i] = Math.max(brr[i],brr[j] + 1);
            }
        }

        int max = 0;
        for(int abbr : brr){
            if(max < abbr)
                max = abbr;
        }
        System.out.println(max);
    }
}
