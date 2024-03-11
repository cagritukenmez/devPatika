package pck;
import java.util.Scanner;
public class DenemeSinifi {
    public static void main(String[] args) {
        int mathematics, physics, chemistry, turkish, history, music;
        Scanner inp = new Scanner(System.in);

        System.out.println("math note :");
        mathematics =inp.nextInt();

        System.out.println("physics note :");
        physics = inp.nextInt();

        System.out.println("chemistry note :");
        chemistry = inp.nextInt();

        System.out.println("turkish note :");
        turkish = inp.nextInt();

        System.out.println("history note :");
        history = inp.nextInt();

        System.out.println("music note :");
        music = inp.nextInt();

        float average = (mathematics + physics + chemistry + turkish + history+music)/6f;
        System.out.println("your average note is :" + average );
        if(average >= 60){
            System.out.println("congratulations! youre passed.");
        }
        else{
            System.out.println("you are failed...");
        }
    }
}
