package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLinePractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//7925+Enter
        // 7925 JonesBranch Dr, Mclean VA,22034
        //fullAddress: Building-number, Street,city state zipCode
        System.out.println("Builder number: ");
        int Bnumber=input.nextInt();//7955
        // if the number have N  change int to String.


        input.nextLine();//Taking out the Enter from Scanner

        System.out.println("Street");
        String street=input.nextLine();


        System.out.println("Enter the zipCode");
       int zipCode=input.nextInt();//22034

        input.nextLine();// take out the Enter

        System.out.println("Enter the city name and state seperated by comma and space");
        String cityState=input.nextLine();

        String fullAddress=Bnumber+" "+street+", \n"+cityState+" "+zipCode;
        System.out.println("Your Address is: "+fullAddress);

        input.close();//close the scanner









    }
}
