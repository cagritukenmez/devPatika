import java.io.*;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please sign the year : ");
        int year = input.nextInt();
        if(year %4 == 0){
            if(year%100 == 0) {
                if(year%400==0)System.out.print(year+" is a leap year !");
                else System.out.print(year+" is not a leap year !");
            }
            else System.out.print(year+" is a leap year !");
        }else{
            System.out.print("is not a leap year !");
        }
    }
}
