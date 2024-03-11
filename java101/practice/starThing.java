package pck;
import java.util.Scanner;

public class DenemeSinifi {
    public static void main(String[] args) {
        System.out.print("ekrana yazdırılacak üçgenin kaç satır olacağını giriniz.");
        int ölçek = new Scanner(System.in).nextInt();
        for(int i =ölçek; i > 0;i--){
            for(int j = i; j > 0; j--){
                System.out.print(' ');
            }
            for(int k = 0; k < (ölçek-i)*2+1;k++){
                System.out.print('*');
            }
            System.out.print('\n');
            //     *
            //    ***
            //   *****
            //  *******
            // *********
            //***********
        }

    }
}
