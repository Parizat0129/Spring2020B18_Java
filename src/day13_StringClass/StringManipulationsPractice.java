package day13_StringClass;

import java.util.Scanner;

public class StringManipulationsPractice {
    public static void main(String[] args) {
        /*
        input: cyBerTek sChool
        out: Cybertek
             School
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname=input.nextLine();//cybertek school

        String firstname=fullname.substring(0,fullname.indexOf(" "));
        String lastname=fullname.substring(fullname.indexOf(" ")+1);
        // cYBErTEK
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();

        System.out.println("Your first name is "+firstname);
        System.out.println("Your last name is "+lastname);

        





    }
}
