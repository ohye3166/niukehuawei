import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author chenzongyi
 * @create 2020-06-25-13:02
 */
public class fifth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = br.readLine()) != null){
            int count = Integer.parseInt(input);
            String str;
            for(int i = 0;i < count;i++){
                str = br.readLine();
                function(str);
            }
        }
    }

    private static void function(String str) {
        int length = str.length();
        int count;
        if(length % 8 == 0)
            count = length / 8;
        else
            count = length / 8 + 1;
        StringBuilder sb = new StringBuilder();
        String newStr;
        int start = 0;
        int end = start + 8;
        for(int i = 0;i < count - 1;i++){
            newStr = str.substring(start,end);
            start += 8;
            end += 8;
            System.out.println(newStr);
        }
        if(length % 8 == 0){
            System.out.println(str.substring(start,end));
        }else{
            newStr = str.substring(start,length);
            sb.append(newStr);
            int count1 = 8 - newStr.length();
            for(int j = 0;j < count1;j++)
                sb.append("0");
            System.out.println(sb.toString());
        }
    }
}
