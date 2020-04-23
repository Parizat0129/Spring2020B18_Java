package OffieceHours.PractceAThome;

import java.util.Scanner;

public class FindUserString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter full name:");
        String name=scan.nextLine();
        boolean usernamefound=name.equalsIgnoreCase("Max Payne")||name.equalsIgnoreCase("Alan Wake");


        if(usernamefound){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
        System.out.println("===========================");

        System.out.println("Please enter the text:");
        String text=scan.next();
        System.out.println("Length is: "+text.length());







    }
}
