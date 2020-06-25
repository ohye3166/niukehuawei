import java.util.*;
public class first{
/*abc你*/
    public static int getResult(int a,int b){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        int k;
        while(b != 0){
            k = a % b;
            a = b;
            b = k;
        }
        /*System.out.println("你好");*/
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num = a * b / getResult(a,b);
            System.out.println(num);
            System.out.println(num);
        }
    }
}