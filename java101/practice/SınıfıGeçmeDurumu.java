package pck;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class DenemeSinifi {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input = new Scanner(System.in);
        int Sum=0;
        byte dersSayisi = 5;
        mat = input.nextInt();
        if(mat > 100 && mat < 0){
            dersSayisi--;
        }else Sum+=mat;
        fizik=input.nextInt();
        if(fizik >100 && fizik < 0){
            dersSayisi--;
        }else Sum+=fizik;
        turkce= input.nextInt();
        if(turkce >100 && turkce < 0){
            dersSayisi--;
        }else Sum+=turkce;
        kimya= input.nextInt();
        if(kimya >100 && kimya < 0){
            dersSayisi--;
        }else Sum+=kimya;
        muzik= input.nextInt();
        if(muzik >100 && muzik < 0){
            dersSayisi--;
        }else Sum+=muzik;
        if(dersSayisi != 0){
            System.out.println("Ortalama : "+(Sum/dersSayisi));
        }
        else System.out.println("Ortalama : "+ 0);
    }
}
