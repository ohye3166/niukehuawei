/**
 * @author chenzongyi
 * @create 2020-06-25-11:56
 */
import java.util.Scanner;
/*
* 思路：构造一个字符串数组，然后用字符串数组构造一个string。
* 用string的CharAt来获取每一个字符
*/

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(revserseStr(str));
    }

    private static String revserseStr(String str) {
        int length = str.length();
        char[] c = new char[length];
        for(int i = length-1,j = 0;i >= 0;i--,j++){
            c[j] = str.charAt(i);
        }
        String newstr = new String(c);
        return newstr;
    }
}
