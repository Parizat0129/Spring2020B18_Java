package day13_StringClass;

import java.util.Scanner;

public class shippingInfoScanner {
    public static void main(String[] args) {
        /*
        write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:

            ex output:

                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter building number");// 112a Enter
        String buildingNum=input.next();//112a

        input.nextLine();//Enter

        System.out.println("Enter your street address");
        String streetAddress=input.nextLine();

        System.out.println("Enter your city name");
        String cityName=input.nextLine();


        System.out.println("Enter your state name");
        String stateName=input.nextLine();

        System.out.println("Enter your zip code");// 60660 Enter
        String zipCode=input.next();// 60660

        input.nextLine();// Enter


        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        String shipping="" ;
        shipping="Shipping To: "+fullName+"\n\t\t"+buildingNum+" "
                   +streetAddress+"\n\t\t"+
                cityName+", "+stateName+" "+zipCode;

        System.out.println(shipping);






    }
}
