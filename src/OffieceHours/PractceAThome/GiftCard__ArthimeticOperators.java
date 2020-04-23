package OffieceHours.PractceAThome;

import java.util.Scanner;

public class GiftCard__ArthimeticOperators {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String item=scan.nextLine();


        if(item.equals("Smartphone")){
            System.out.println("Than you for your purchase!\nSorry,not enough funds on your gift card!");
        }else if(item.equals("Laptop")){
            System.out.println("Than you for your purchase!\nSorry,not enough funds on your gift card!");
        }else if(item.equals("Charger")){
            System.out.println("Than you for your purchase!\nYour current balance is: 85$");
        }else if(item.equals("USB cable")){
            System.out.println("Than you for your purchase!\nYour current balance is: 90$");
        }else if(item.equals("Headphones")){
            System.out.println("Than you for your purchase!\nYour current balance is: 70$");
        }else if(item.equals("Pants")){
            System.out.println("Than you for your purchase!\nYour current balance is: 50$");
        }else if(item.equals("Hat")){
            System.out.println("Than you for your purchase!\nYour current balance is: 75$");
        }else if(item.equals("Socks")){
            System.out.println("Than you for your purchase!\nYour current balance is: 95$");
        }else if(item.equals("Blanket")){
            System.out.println("Than you for your purchase!\nYour current balance is: 40$");
        }else if(item.equals("Pillow")){
            System.out.println("Than you for your purchase!\nYour current balance is: 60$");
        }else{
            System.out.println("Invalid item!");
        }





    }
}
