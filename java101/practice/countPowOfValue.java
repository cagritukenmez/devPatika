import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int countPowOfFour=0;
        int countPowOfFive=0;
        int valueCover = value;
        while(value %4==0){
            value/=4;
            countPowOfFour++;
        }
        while(value%5==0){
            value/=5;
            countPowOfFive++;
        }
        System.out.print("pow of four : " +countPowOfFour+" pow of five : "+countPowOfFive);
    }
}
