import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstValue=input.nextInt();
        double result =0;
        for(double i=1;i<=firstValue;i++){
            result+=(1/i);
        }
        System.out.print(result);
    }
}
