package day14_StringClass2;

import java.util.Scanner;

/*
 Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */
public class middleCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your word");
        String word=input.next();//Cyber
        //                         01234
        //                         bananas
        //                         0123456

        String midC="";// to store the middle character at the end

        int totalChars=word.length(); // 5    .7/2====>3
        int middleNumber=totalChars/2; // 5/2===>2

        if(totalChars%2!=0){// odd number
           // midC +=word.charAt(middleNumber);
            midC=midC+word.charAt(middleNumber);
        }else{
            //even number
            midC=midC+word.charAt(middleNumber-1)+word.charAt(middleNumber);
        }
        System.out.println("Middle character is: "+midC);
  //  anything we add to a string will return it as string





    }
}
