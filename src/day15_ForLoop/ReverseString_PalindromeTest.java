package day15_ForLoop;

import java.util.Scanner;

public class ReverseString_PalindromeTest {
    public static void main(String[] args) {
        /*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your world");
        String world=input.nextLine();

        String reverseWord ="";
        int lastIndexNumber=world.length()-1;
        for(int i=lastIndexNumber;i>=0;i--){
             reverseWord +=world.charAt(i);
        }

        System.out.println(reverseWord);


       if(world.equalsIgnoreCase(reverseWord)){
           System.out.println(world +" is palindrome");
       }else{
           System.out.println(world+" is not palindrome");
       }






    }
}
