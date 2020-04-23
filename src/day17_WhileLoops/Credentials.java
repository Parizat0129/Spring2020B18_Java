package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
/*
Write a program that asks user to enter
his/her username and password until user enters correctly.
       user:cybertek
       pass:cybertek123
 */
        Scanner input=new Scanner (System.in);
        System.out.println("Enter user name");
        String username=input.next();

        System.out.println("Enter pass word");
        String password=input.next();

        boolean valid=(username.equals("cybertek")&&password.equals("cybertek123"));
        // first user name and password

        int count=1;

        while(!valid){
            System.out.println("Please re enter your credentions");
            System.out.println("Enter user name");
            username=input.next();

            System.out.println("Enter your password");
            password=input.next();
            valid=(username.equals("cybertek")&&password.equals("cybertek123"));//true
            // new user name and passwords

         count++;

            if(count==3&&!valid){
                System.out.println("Your account is looked");
                break;

            }


        }

        if(valid){
            System.out.println("Logged in");
        }









    }
}
