package pck;
import java.util.Scanner;
public class DenemeSinifi {
    public static void main(String[] args) {
        float girilenDeger = new Scanner(System.in).nextFloat();
        if(girilenDeger < 1000 && girilenDeger > 0){
            System.out.println("KDV'siz fiyat = "+girilenDeger);
            System.out.println("KDV'li fiyat = "+girilenDeger*(118/100f));
            System.out.println("KDV tutarı = "+girilenDeger*(18/100f));
        }
        else if(girilenDeger >= 1000){
            System.out.println("KDV'siz fiyat = "+girilenDeger);
            System.out.println("KDV'li fiyat = "+girilenDeger*(108/100f));
            System.out.println("KDV tutarı = "+girilenDeger*(8/100f));
        }
        else{
            System.out.println("please sign a value which is greater than 0");
        }
    }
}
