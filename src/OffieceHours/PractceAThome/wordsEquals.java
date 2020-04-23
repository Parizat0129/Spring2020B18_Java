package OffieceHours.PractceAThome;


import java.util.Scanner;

public class wordsEquals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two words");
        String word1=input.next();
        String word2=input.next();
        if(word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }

        String answer=input.next();
        if(answer.equals("a")){
            System.out.println("a is wrong");
        }else if(answer.equals("b")){
            System.out.println("b is correct");
        }else if (answer.equals("c")){
            System.out.println("c is wrong");
        }else {
            System.out.println(answer+" is not a valid answer");

        }








    }
}
