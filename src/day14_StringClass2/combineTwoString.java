package day14_StringClass2;

import java.util.Scanner;

public class combineTwoString {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First word");
        String word1=input.next();
        System.out.println("Enter Second word");
        String word2=input.next();


        String result=word1.concat(" "+word2).concat(" "+word2.concat(" "+word1));

        System.out.println(result);





    }
}
