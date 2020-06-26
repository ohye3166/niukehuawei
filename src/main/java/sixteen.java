import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-26-9:50
 */
public class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] nums = new int[count];
            for(int i = 0;i < count;i++){
                nums[i] = Integer.parseInt(strs[i]);
            }
            int sum1 = 0, sum2 = 0;
            int index = 0;
            int[] newNum = new int[count];
            for(int num : nums){
                if(num % 5 == 0)
                    sum1 += num;
                else if(num % 3 == 0)
                    sum2 += num;
                else
                    newNum[index++] = num;
            }
            boolean flag = function(sum1,sum2,newNum,0);
            System.out.println(flag);
        }
    }

    private static boolean function(int sum1, int sum2, int[] nums, int index) {
        if(index == nums.length && sum1 == sum2)
            return true;
        if(index == nums.length && sum1 != sum2)
            return  false;
        if(index < nums.length)
            return function(sum1 + nums[index],sum2,nums,index+1) || function(sum1 ,sum2+ nums[index],nums,index+1);
        return false;
    }
}
