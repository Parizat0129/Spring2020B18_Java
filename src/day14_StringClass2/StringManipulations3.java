package day14_StringClass2;

public class StringManipulations3 {
    public static void main(String[] args) {
       String str1="CYBERTEK";
       String str2="cybertek";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));// true;ignore case sensitivity



        String s1="Cybertek School";
       boolean r1= s1.contains("School");// true
        System.out.println(r1);
        System.out.println("==================================================");

        String s3="United Stated";
        System.out.println(s3.startsWith("U"));//true

        String s4="Cybertek School";
        System.out.println(s4.endsWith("l"));// true
        System.out.println(s4.endsWith("School"));

        System.out.println(s4.endsWith("Cybertek"));









    }
}
