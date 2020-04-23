package OffieceHours.PractceAThome;

import java.util.Arrays;
import java.util.Scanner;

public class Array_SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();



        String [] words=sentence.split(" ");

        for(int i=words.length-1;i>=0;i--){
            System.out.println(words[i]);

        }















    }
}
