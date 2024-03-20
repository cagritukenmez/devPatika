import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner.(System.in);
        int value = input.nextInt();
        int sum=0;
        while(value > 0){
            if(value %12 == 0) sum+=value;
            value--;
        }
        System.out.println("The sum of multiples of 12 : "+sum);
    }
}
