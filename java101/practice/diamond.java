import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstValue=input.nextInt();
        for(int i =firstValue;i>=0;i--){
            for(int k=i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<2*(firstValue-i)+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=firstValue;i>0;i--){
            for(int k=firstValue-i+1;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
