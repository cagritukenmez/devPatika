import java.io.*;
import java.util.*;
public class DenemeSinifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstValue=input.nextInt();
        int secondValue = input.nextInt();
        long result=1;
        for(int i =0;i<secondValue;i++){
            result*=firstValue;
        }
        System.out.print(result);
    }
}
