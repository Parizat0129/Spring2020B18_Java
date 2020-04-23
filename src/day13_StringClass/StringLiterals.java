package day13_StringClass;
//import java.lang.String    not necessary .
public class StringLiterals {
    public static void main(String[] args) {

        String str1="Cat";// String Pool
        String str2=new String ("Cat");// Java Heap
        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);// two different object ,false

        String str3="Cat";//String Pool

        System.out.println(str1==str3);//true

        String str4=new String("Cat");
        System.out.println(str2==str4);// two are independent object, false

        String s1="Java";//String Pool,immutable we cant modify it
        s1 ="JavaScript";// new object will be created in memory
        System.out.println(s1);// Java Script
        String s2="Java";// String Pool// no new object will be created in the memory

        System.out.println(s1==s2);// false
        //                 "JavaScript"=="Java"====>false





    }
}
