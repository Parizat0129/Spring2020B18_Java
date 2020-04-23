package OffieceHours.PractceAThome;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String world=scan.next();

        String reverse ="";
        int lastIndexNumber=world.length()-1;
        for(int n=lastIndexNumber;n>=0;n--){
            reverse +=world.charAt(n);
        }

       if(lastIndexNumber<4){
           System.out.println("Too short!");
       }else if(lastIndexNumber>4){
           System.out.println("Too long!");
       }else if(lastIndexNumber==4){
           System.out.println(reverse);
       }




    }
}
