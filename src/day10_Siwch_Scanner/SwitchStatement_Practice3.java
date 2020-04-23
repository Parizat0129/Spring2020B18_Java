package day10_Siwch_Scanner;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
     char ch='C';
     String result = " ";

     switch (ch){
         case 'A' :
             result= "A";
             break;


         case 'B':
             result="B";
             break;

         case 'C':
             result="C";
             break;


         case 'D':
            result="D";

         case 'E':
             result="E";
             break;

         default:
             result="Not found";
             break;




     }
        System.out.println(result);










    }
}
