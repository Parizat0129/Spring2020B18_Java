package OffieceHours.PractceAThome;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        /*Assignment :
        write a program that asks the user first and last names,
        then prints the initials.
                ex:
        input:
        cybertek
                school
        output:
        CS
                */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name ");
        String firstname=input.nextLine();
        System.out.println("Enter your last name ");
        String lastname=input.nextLine();

        String firstnameI=firstname.substring(0,1).toUpperCase();
        String lastnameI=lastname.substring(0,1).toUpperCase();

        String In=firstnameI+lastnameI;
        System.out.println("Your initial :" +In);


    }
}
