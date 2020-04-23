package day11_Scanner;

import java.util.Scanner;

public class nextLine_practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age=input.nextInt();//30 + enter

        System.out.println("you age is: "+age);

        input.nextLine();//Enter

        System.out.println("Enter your full number: ");
        String fullName= input.nextLine();

        System.out.println("Your full name is: "+fullName);







    }
}
