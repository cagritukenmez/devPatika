import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int sum=0;
        while(value %2 != 1){
            if(value%4==0) sum+=value;
            value=input.nextInt();
        }
        System.out.print(sum);
    }
}
