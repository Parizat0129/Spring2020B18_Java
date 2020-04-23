package day22_Arrays_Loops;

import java.util.Arrays;
import java.util.Scanner;

/*
se for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban

        Arrays Scanner, for loop, for each loop ,  substring
 */
public class Scanner_Arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String arr[]=new String [5];

        for(int i=0; i<arr.length; i++){

            System.out.println("Enter your word");
                     arr[i]=input.next();
        }

        System.out.println(Arrays.toString(arr));

        for(String eachWord:arr){
           String str= eachWord.charAt(0)+""+ eachWord.charAt(eachWord.length()-1);
           // first and las characters.
            System.out.println(str);
            //System.out.println(eachWord.substring(0,3));
            // fist 3 characters

        }













































    }
}
