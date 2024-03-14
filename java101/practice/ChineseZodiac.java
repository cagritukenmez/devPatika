import java.io.*;
import java.util.*;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your born year : ");
        int bornYear = input.nextInt();
        int remainingNumber = bornYear%12;
        System.out.print("Your Chinese zodiac sign is : ");
        switch (remainingNumber){
            case 0:
                System.out.print("Monkey");
                break;
            case 1:
                System.out.print("Cockerel");
                break;
            case 2:
                System.out.print("Dog");
                break;
            case 3:
                System.out.print("Pig");
                break;
            case 4:
                System.out.print("Mouse");
                break;
            case 5:
                System.out.print("steer");
                break;
            case 6:
                System.out.print("Tiger");
                break;
            case 7:
                System.out.print("Rabbit");
                break;
            case 8:
                System.out.print("Dragon");
                break;
            case 9:
                System.out.print("Snake");
                break;
            case 10:
                System.out.print("Horse");
                break;
            case 11:
                System.out.print("Sheep");
                break;
            default:
                break;
        }
    }
}
