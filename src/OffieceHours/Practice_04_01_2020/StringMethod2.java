package OffieceHours.Practice_04_01_2020;

public class StringMethod2 {
    public static void main(String[] args) {

  // isEmpty(): check if the string is empty, returns boolean

        String str1="  ";
        boolean r1=str1.isEmpty();//false
        System.out.println(r1);

        boolean r2=!str1.isEmpty();// true
        System.out.println(r2);

        System.out.println("===============================================");

        // equals(str): check two string of text are equal or not, returns boolean.only check visiable text
     //    equalsIgnoreCase(str):without case sensitivity
        // ==

        String s1="cat";
        String s2=new String ("cat");
        String s3="Cat";
        System.out.println(s1==s2); //false

        System.out.println(s1.equals(s2));  // true

        System.out.println(s1.equals(s3));// false
        System.out.println(s1.equalsIgnoreCase(s3)); // true


        System.out.println("=============================================");


        // contains(str): check if the str is included in the string, returns boolean


        String sentence="i like to learn Java";
        System.out.println(sentence.contains("Java"));// true


        String sentence2="Top 2 Viruses are 1. Corona, 2. Hanta, 3. Ebola";
        System.out.println(sentence2.contains("Java"));// false


        System.out.println("=============================================");

        // startsWith(str):check if the string starts with  given str
        // endsWith(str):check if the string ends with  given str

        String web="www.amazon.com";

        System.out.println(web.startsWith("www"));//true
        System.out.println(web.startsWith("wwwww"));// false


        String gmail="CybertekSchool@gmail.com";

        System.out.println(gmail.endsWith("@gmail.com"));// true
        System.out.println(gmail.endsWith("@hotmail.com"));//false








    }
}
