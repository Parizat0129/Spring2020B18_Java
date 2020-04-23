package OffieceHours.Practice_04_15_2020;

import java.util.Arrays;
/*
    String methods:
            toCharArray(): returns char array
            split(str): splits the string by given str, returns string array
     */
public class StringMethods {
    public static void main(String[] args) {
        String  str="Cybertel";

        char [] ch=str.toCharArray();// ['C', 'y',b e r t e k]
        System.out.println(str.length()==ch.length);// true
        /*
        str1="abc",  str2="cba"
        ['A', 'B', 'C']
        ['B', 'A',  'C']
        then sort
      then ['A', 'B', 'C']
              */
         String str1="ABC";
         String str2="BAC";

        char[] ch1=str.toCharArray();//['A', 'B', 'C']
        char[] ch2=str.toCharArray();// ['B', 'A',  'C']

        Arrays.sort(ch1);//['A', 'B', 'C']
        Arrays.sort(ch2);//['A', 'B', 'C']
        System.out.println(Arrays.equals(ch1,ch2));//true

        System.out.println("==================================");

        String sentence="I like to lean java";

        String [] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, to, lean, java]

        int totalWords=words.length;
        System.out.println(totalWords);
         String result="";
        //[I, like, to, lean, java]
        for(int i=words.length-1;i>=0;i--){
           // System.out.print(words[i]+" ");
            // or

            result+=words[i]+" ";
        }
        System.out.println(result.trim());


        //  java learn to like i











    }
}
