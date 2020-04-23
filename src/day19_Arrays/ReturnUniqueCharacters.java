package day19_Arrays;

import java.util.Scanner;

/*
write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"
 */
public class ReturnUniqueCharacters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");

       String str =input.next();
       String result="";

       for(int j=0;j<=str.length()-1;j++){

           int count=0;// to count the occurcence of the characters;
           for(int i=0;i<=str.length()-1;i++){
           // char ch=str,charAt(i);
           //if(ch=='a')
               if(str.charAt(i)==str.charAt(j)){// check how many times the character is occured in the string
                   count++;
               }
           }
           if(count==1){//check character at J id unique, will be concated to the result
               result+=str.charAt(j);
           }

       }

        System.out.println(result);




















    }
}
