package day10_Siwch_Scanner;

import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args) {
     // Scanner variableName= new Scanner(System.inn);
     Scanner input= new Scanner  (System.in);
        System.out.println("Enter a byte number:");
    byte num1 = input.nextByte();

        System.out.println("You have enter "+num1);//12

        if(num1%2==0){
            System.out.println(num1+"is even number");
        }else{
            System.out.println(num1+"is odd number");
        }



    }
}
