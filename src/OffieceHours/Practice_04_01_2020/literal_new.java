package OffieceHours.Practice_04_01_2020;

public class literal_new {
    public static void main(String[] args) {
        //String literal
        String s1="Java";
        String s2="Java";
        //String new
        String s3=new String("Java");
        String s4=new String("Java");

        System.out.println(s1==s2);// true
        System.out.println(s1==s3);// false different object at different memory
        System.out.println(s3==s4);//  false  different object





    }
}
