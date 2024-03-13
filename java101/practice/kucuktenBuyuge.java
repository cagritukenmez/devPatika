package pck;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class DenemeSinifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        System.out.print("1. sayıyı gir.");
        sayi1=input.nextInt();
        System.out.print("1. sayıyı gir.");
        sayi2=input.nextInt();
        System.out.print("1. sayıyı gir.");
        sayi3=input.nextInt();
        if(sayi1<sayi2){
            int buyuk = sayi2;
            sayi2=sayi1;
            sayi1=buyuk;
        }
        if(sayi1>sayi3){
            if(sayi2>sayi3){
                System.out.println(sayi1 + " " + sayi2 +" "+ sayi3);
            }else{
                System.out.println(sayi2+" "+sayi3+" "+sayi1);
            }
        }
        else{
            System.out.print(sayi2+" "+sayi1+" "+sayi3);
        }
    }
}
