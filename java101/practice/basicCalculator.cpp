package pck;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class DenemeSinifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first value : ");
        int firstValue = input.nextInt();
        System.out.print("Please enter the second value : ");
        int secondValue = input.nextInt();

        System.out.println("1-addition\n2-substract\n3-multiple\n4-divide");
        byte  operation = input.nextByte();
        switch(operation){
            case 1:
                System.out.println("The result is = " + (firstValue + secondValue));
                break;
            case 2:
                System.out.println("The result is = " + (firstValue - secondValue));
                break;
            case 3:
                System.out.println("The result is = " + (firstValue * secondValue));
                break;
            case 4:
                if(secondValue == 0) System.out.println("the error of divide to 0");
                else System.out.println("The result is = " + (firstValue/secondValue));
                break;
            default:
                System.out.println("Please enter a value between 1 and 4!!!");
                break;
        }
    }
}
