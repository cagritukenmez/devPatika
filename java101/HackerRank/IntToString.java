import java.io.*;
import java.util.*;

public class Solution {
    static int n;
    static String s;
    static boolean flag;
    static{
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        scanner.close();
        s=Integer.toString(n);
        if(n==Integer.parseInt(s)){
            flag =true;
        }
        else {
            flag = false;
            System.out.println("Wrong anster.");
        }
    }
    public static void main(String[] args) {
        if(flag){
            System.out.println("Good job");
        }
    }
}
