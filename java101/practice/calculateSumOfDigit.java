import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstValue=input.nextInt();
        int digit=0;
        while(firstValue !=0){
            digit+=firstValue%10;
            firstValue/=10;
        }
        System.out.print(digit);
    }
}
