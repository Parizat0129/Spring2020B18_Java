package OffieceHours.PractceAThome;

import java.util.Scanner;

public class ScannerPritice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName=input.nextLine();
        System.out.println("Enter your last name");
        String lastName=input.nextLine();
        System.out.println("Enter your email");
        String email=input.nextLine();
        System.out.println("Enter your street");
        String street=input.nextLine();
        System.out.println("Enter your city");
        String city=input.nextLine();
        System.out.println("Enter your state");
        String state=input.nextLine();
        System.out.println("Enter your zip code");
        int zipCode=input.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone=input.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhone=input.nextLong();

        System.out.println("Enter your age");
        int age=input.nextInt();
        System.out.println("Enter your height");
        double height=input.nextDouble();
        System.out.println("Enter your weight");
        double weight=input.nextDouble();
        System.out.println("Are you married?");
        boolean married=input.nextBoolean();


        System.out.println("Patient person information");
        System.out.println("Full name:"+lastName+","+firstName);
        System.out.println("Address: "+street+","+city+","+state+" "+zipCode);
        System.out.println("Contacts:work phone number - "+workPhone+",personal phone number-"+personalPhone+",email: "+email);
        System.out.println("Age:"+age);
        System.out.println("Height:"+height);
        System.out.println("Wight:"+weight+"pounds");
        System.out.println("Married?:"+married);











    }
}
