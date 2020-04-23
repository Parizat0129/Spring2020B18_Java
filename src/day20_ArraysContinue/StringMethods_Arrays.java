package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods_Arrays {
    public static void main(String[] args) {


    String name ="Parizat Aizi";
    char[]ch=name.toCharArray();

        System.out.println(Arrays.toString(ch));

        String str1="Cybertek School";
        String str2="School Cybertek";

        char []ch1=str1.toCharArray();// returns arrays
        char[]ch2=str2.toCharArray();


        Arrays.sort(ch1); // same order
        Arrays.sort(ch2);

        boolean result=Arrays.equals(ch1,ch2);
        System.out.println(result);// str1 &str2 are bult out of same characters















}
}