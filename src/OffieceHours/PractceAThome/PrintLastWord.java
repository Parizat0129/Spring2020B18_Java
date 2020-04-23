package OffieceHours.PractceAThome;

import java.util.Scanner;

public class PrintLastWord {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word=scan.next();

        System.out.print(word.charAt(word.length()-1));

    }
}
