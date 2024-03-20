import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int bottomHelper =r;
        if(n-r < r)r=n-r;
        long top = 1;
        long bottom=1;
        for(int i =0;i<r;i++){
            top*=n--;
            bottom*=bottomHelper--;
        }
        long result = top/bottom;
        System.out.print(result);
    }
}
