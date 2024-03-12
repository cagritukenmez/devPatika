package pck;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class userLogin {
    public static void main(String[] args) {
        String userName,password,askReset,newUserName,newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username : ");
        userName = input.nextLine();

        System.out.print("Enter your password : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java321")){
            System.out.println("You logged in successfully !!! ");
        }
        else{
            System.out.println("Your username or password is wrong!\nDo you want to reset your password?(y/n)");
            askReset = input.next();
            if(askReset.equals("y")){
                System.out.print("Enter your username : ");
                newUserName = input.nextLine();

                System.out.print("Enter your password : ");
                newPassword = input.nextLine();
                if(newUserName.equals(userName) && newPassword.equals(password)){
                    System.out.print("Could not create password.");
                }
                else{
                    System.out.print("The password created successfully.")
                }
            }
            else{
                System.out.print("Sayonara...");
            }
        }
    }
}
