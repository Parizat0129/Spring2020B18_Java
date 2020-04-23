package day15_ForLoop;

import java.util.Scanner;

public class InitialsOfUser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
/*
 write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
 */

        System.out.println("Enter your first name:");
        String firstName=input.next();
        System.out.println("Enter your last name");
        String lastName=input.next();
/*
        String initial=firstName.substring(0,1).toUpperCase().toUpperCase()+
                lastName.substring(0,1).toUpperCase();

        //initial=initial.toUpperCase();
        System.out.println(initial);
      */

String initials="" +firstName.charAt(0)+lastName.charAt(0);
        System.out.println(initials.toUpperCase());




    }
}
