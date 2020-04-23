package OffieceHours.PractceAThome;

import java.util.Scanner;

public class PrintFirstandlastLetters_StringMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();

       String firstLetter=word.substring(0,1);
       String lastLetter=word.substring(word.length()-1,word.length());

        System.out.print(firstLetter+lastLetter);

    }
}
