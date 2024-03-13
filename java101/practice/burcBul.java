package pck;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class DenemeSinifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gün = input.nextInt();
        int ay = input.nextInt();
        if(ay > 0 && ay <=12 && gün > 0 && gün <=30 ){
            if(ay == 1){
                if(gün <= 21)System.out.print("Oğlak burcu.");
                else System.out.print("Kova burcu");
            }
            else if(ay == 2){
                if(gün <= 19)System.out.print("Kova burcu.");
                else System.out.print("Balık burcu");
            }
            else if(ay == 3){
                if(gün <= 20)System.out.print("Balık burcu.");
                else System.out.print("Koç burcu");
            }
            else if(ay == 4){
                if(gün <= 20)System.out.print("Koç burcu.");
                else System.out.print("Boğa burcu");
            }
            else if(ay == 5){
                if(gün <= 21)System.out.print("Boğa burcu.");
                else System.out.print("İkizler burcu");
            }
            else if(ay == 6){
                if(gün <= 22)System.out.print("İkizler burcu.");
                else System.out.print("Yengeç burcu");
            }
            else if(ay == 7){
                if(gün <= 22)System.out.print("Yengeç burcu.");
                else System.out.print("Aslan burcu");
            }
            else if(ay == 8){
                if(gün <= 22)System.out.print("Aslan burcu.");
                else System.out.print("Başak burcu");
            }
            else if(ay == 9){
                if(gün <= 22)System.out.print("Başak burcu.");
                else System.out.print("Terazi burcu");
            }
            else if(ay == 10){
                if(gün <= 22)System.out.print("Terazi burcu.");
                else System.out.print("Akrep burcu");
            }
            else if(ay == 11){
                if(gün <= 21)System.out.print("Akrep burcu.");
                else System.out.print("Yay burcu");
            }
            if(ay == 12){
                if(gün <= 21)System.out.print("Yay burcu.");
                else System.out.print("Oğlak burcu");
            }


        }
    }
}
