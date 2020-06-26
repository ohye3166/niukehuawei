import java.util.Scanner;

/*
前面是空或者不是数字，后面是空或者不是数字。
把符合要求的存入String的数组
对数组进行查找，找出最长的
遍历对最长的进行输出
*/

public class sixteen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {


            String str = sc.nextLine();
            char[] ac = str.toCharArray();
            String[] strs = new String[str.length()];
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((i == 0 || (ac[i - 1] < '0' || ac[i - 1] > '9')) && (ac[i] >= '0' && ac[i] <= '9')) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ac[i]);
                    if (i != str.length() - 1) {
                        while (ac[++i] >= '0' && ac[i] <= '9') {
                            sb.append(ac[i]);
                            if (i == str.length() - 1)
                                break;
                        }
                    }
                    strs[index++] = sb.toString();
                    //System.out.println(sb.toString());
                }
            }
            function(strs, index);
        }
    }

    public static void function(String[] strs,int index){
        int max = 0;
        int i = 0;
        for(String str : strs){
            if(i < index) {
                //System.out.println(str);
                max = (max > str.length()) ? max : str.length();
                i++;
            }
            else
                break;
        }
        i = 0;
        for(String str : strs){
            if(i < index) {
                i++;
                if (str.length() == max)
                        System.out.print(str);
            }
            else
                break;
        }
        System.out.println("," + max);


    }
}