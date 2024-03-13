package pck;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class DenemeSinifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz.");
        int heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        else if(heat < 15){
            System.out.println("Sinema izlemeye gidebiliriniz.");
        }
        else if(heat < 25){
            System.out.println("Piknik yapmaya gidebiliriniz.");
        }
        else{
            System.out.println("Yüzmeye gidebilirniz.");
        }
    }
}
