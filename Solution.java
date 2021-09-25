import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Solution {
    static String test(List<Integer> arr ){
        int x=0;
        int sum=0;
        for(int a : arr){
            sum = sum + a;
        }
        for(int y : arr){
            if(2*x == sum - y){
                return "Yes";
            }
            x=x+y;
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i =0;i<n;i++){
                list.add(in.nextInt());
            }
            System.out.print(test(list));
        }
        in.close();
    }
}
