package OffieceHours.PractceAThome;

import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String sentence = scan.nextLine();
int countJava=0;
int countPython=0;

   String []words=sentence.split(" ");

   for(String eachwords:words){
       if(eachwords.contains("java")){
           countJava++;
       }
   if(eachwords.contains("python")){
       countPython++;
   }

   }

        System.out.println(countJava==countPython);
















    }

}