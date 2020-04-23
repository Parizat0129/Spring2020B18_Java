package day26_MethodOverloading;

import Resources.Library;

/*
Warmup tasks:
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
	2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
 */



public class Frequency_StringAndChar {
    public static void main(String[] args) {
        String str="ABB";
        char ch='A';

        char []arr= str.toCharArray();//[A,B,B]
        int count=0;//1
        for (  char each :arr){//3 each:A , B, B
            if(each==ch){
                count++;
            }
        }
        System.out.println(count);


        String str2="AAABBCCC";
        char ch2='B';
        int num=Frequency(str2,ch2);
        System.out.println(num);




    }

    public static int Frequency(String str,char ch) {// counts the char frenqyency
        char[] arr = str.toCharArray();//[A,B,B]
        int count = 0;//1
        for (char each : arr) {//3 each:A , B, B
            if (each == ch) {
                count++;
            }

        }
        return count;
    }



    }
