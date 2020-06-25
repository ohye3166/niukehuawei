import java.util.*;

/**
 * @author chenzongyi
 * @create 2020-06-25-15:06
 */

/*
* 思路：
* 遍历一个字符串的字符
* 使用一个hashmap来存放字符
* 比较所有value值，优先输出最大的，如果相同则输出asll码小的那个
* */
public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {


            String str = sc.nextLine();
            Map map = new HashMap<Character, Integer>();
            int count;
            for (int i = 0; i < str.length(); i++) {
                Character c = str.charAt(i);
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else {
                    count = (int) map.get(c);
                    count++;
                    map.put(c, count);
                }
            }
            function(map);
            System.out.println();
        }
    }

    private static void function(Map map) {
        while (!map.isEmpty()) {
            Set<Map.Entry<Character, Integer>> entry = map.entrySet();
            int max = 0;
            for (Map.Entry me : entry) {
                max = Math.max(max, (int) me.getValue());
            }
            TreeSet<Character> ts = new TreeSet<Character>();

            for (Map.Entry me : entry) {
                if (max == (int) me.getValue())
                    ts.add((Character) me.getKey());
            }
            for(Character c : ts){
                System.out.print(c);
            }
            for (Character c : ts) {
                map.remove(c);
            }
        }
    }
}
